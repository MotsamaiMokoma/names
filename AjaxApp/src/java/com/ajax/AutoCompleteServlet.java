/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package com.ajax;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

@WebServlet(name = "AutoCompleteServlet", urlPatterns = { "/autocomplete" })
public class AutoCompleteServlet extends HttpServlet {

    private ComposerData compData = new ComposerData();
    private HashMap<String, Composer> composers = compData.getComposers();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");
        String targetId = request.getParameter("id");

        if (action == null || targetId == null) {
            // Invalid request, forward to error page
            request.getRequestDispatcher("/error.jsp").forward(request, response);
            return;
        }

        targetId = targetId.trim().toLowerCase();

        boolean namesAdded = false;
        StringBuilder sb = new StringBuilder();

        if ("complete".equals(action)) {
            if (!targetId.isEmpty()) {
                Iterator<String> it = composers.keySet().iterator();
                while (it.hasNext()) {
                    String id = it.next();
                    Composer composer = composers.get(id);

                    if (composer.getFirstName().toLowerCase().startsWith(targetId)
                            || composer.getLastName().toLowerCase().startsWith(targetId)
                            || (composer.getFirstName() + " " + composer.getLastName()).toLowerCase()
                            .startsWith(targetId)) {

                        sb.append("<composer>");
                        sb.append("<id>").append(composer.getId()).append("</id>");
                        sb.append("<firstName>").append(composer.getFirstName()).append("</firstName>");
                        sb.append("<lastName>").append(composer.getLastName()).append("</lastName>");
                        sb.append("</composer>");
                        namesAdded = true;
                    }
                }
            }

            if (namesAdded) {
                response.setContentType("text/xml");
                response.setHeader("Cache-Control", "no-cache");
                response.getWriter().write("<composers>" + sb.toString() + "</composers>");
            } else {
                response.setStatus(HttpServletResponse.SC_NO_CONTENT);
            }
        } else if ("lookup".equals(action)) {
            if (composers.containsKey(targetId)) {
                request.setAttribute("composer", composers.get(targetId));
                request.getRequestDispatcher("/composer.jsp").forward(request, response);
            } else {
                
                response.setStatus(HttpServletResponse.SC_NO_CONTENT);
            }
        }
    }
}
