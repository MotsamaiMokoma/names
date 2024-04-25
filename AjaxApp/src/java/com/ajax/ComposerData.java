package com.ajax;

import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tsepo
 */
public class ComposerData {
    
    private HashMap composers = new HashMap();

    public HashMap getComposers() {
        return composers;
    }

    public ComposerData() {

        composers.put("1", new Composer("1", "Pitla", "Lejoe", "Baroque"));
        composers.put("2", new Composer("2", "Sefali", "Letlatsa", "Baroque"));
        composers.put("3", new Composer("3", "Thamae", "Bobebe", "Baroque"));
        composers.put("4", new Composer("4", "Chinelo", "Sekese", "Baroque"));
        composers.put("5", new Composer("5", "Thabo", "Mponeng", "Baroque"));
        composers.put("6", new Composer("6", "Tsipora", "Juju", "Baroque"));
        composers.put("7", new Composer("7", "Alefarete", "Antone", "Baroque"));

        composers.put("8", new Composer("8", "AtiAce", "Mofammere", "Classical"));
        composers.put("9", new Composer("9", "Chika", "Thato", "Classical"));
        composers.put("10", new Composer("10", "Tata", "Lefa", "Classical"));
        composers.put("11", new Composer("11", "Kwasi", "Lefa", "Classical"));
        composers.put("12", new Composer("12", "Chinelo", "Phakisi", "Classical"));
        composers.put("13", new Composer("13", "Farai", "Namane", "Classical"));
        composers.put("14", new Composer("14", "Thabo", "Lebese", "Classical"));
        composers.put("15", new Composer("15", "Moleko", "Tlotliso", "Classical"));
        composers.put("16", new Composer("16", "Selebalo", "Mapepe", "Classical"));
        composers.put("17", new Composer("17", "Tari", "Linaoa", "Classical"));
        composers.put("18", new Composer("18", "Tlama", "Okeke", "Classical"));
        composers.put("19", new Composer("19", "Chakatsa", "Mophehi", "Classical"));

        composers.put("20", new Composer("20", "Lira", "Tlamo", "Romantic"));
        composers.put("21", new Composer("21", "Seboba", "Lithakong", "Romantic"));
        composers.put("22", new Composer("22", "Lilatsoa", "Moshoeshoe", "Romantic"));
        composers.put("23", new Composer("23", "Khosi", "Ntho", "Romantic"));
        composers.put("24", new Composer("24", "Motsamai", "Matekane", "Romantic"));
        composers.put("25", new Composer("25", "Lebona", "Thato", "Romantic"));
        composers.put("26", new Composer("26", "Baba", "Matala", "Romantic"));
        composers.put("27", new Composer("27", "Chuo", "Mafatla", "Romantic"));
        composers.put("28", new Composer("28", "Mpa", "Litsu", "Romantic"));
        composers.put("29", new Composer("29", "Khang", "Sebele", "Romantic"));

        composers.put("30", new Composer("30", "Ama", "Toloane", "Romantic"));
        composers.put("31", new Composer("31", "Lefielo", "Bathobakae", "Romantic"));
        composers.put("32", new Composer("32", "Sisita", "Hlohana", "Romantic"));
        composers.put("33", new Composer("33", "Chefu", "Lipere", "Romantic"));
        composers.put("34", new Composer("34", "Mokola", "Hlathe", "Romantic"));
        composers.put("35", new Composer("35", "Litsu", "Bohloko", "Romantic"));
        composers.put("36", new Composer("36", "Nomsa", "Phakisi", "Romantic"));
        composers.put("37", new Composer("37", "Mosa", "Hlabaoje", "Romantic"));
        composers.put("38", new Composer("38", "Mphe", "Hlatsoane", "Romantic"));
        composers.put("39", new Composer("39", "Mokhoa", "Libeso", "Romantic"));
        composers.put("40", new Composer("40", "Khang", "Kholo", "Romantic"));

        composers.put("41", new Composer("41", "Lefu", "Lesele", "Post-Romantic"));
        composers.put("42", new Composer("42", "Bitso", "Lebe", "Post-Romantic"));
        composers.put("43", new Composer("43", "Mafatshe", "Thothomela", "Post-Romantic"));
        composers.put("44", new Composer("44", "Tshita", "Nokoane", "Post-Romantic"));
        composers.put("45", new Composer("45", "Mohla", "Monene", "Post-Romantic"));
        composers.put("46", new Composer("46", "Hoya", "Kamara", "Post-Romantic"));
        composers.put("47", new Composer("47", "Hase", "Hofela", "Post-Romantic"));
        composers.put("48", new Composer("48", "Hochecha", "Hoaramo", "Post-Romantic"));
        composers.put("49", new Composer("49", "Hase", "Hobaleha", "Post-Romantic"));
        composers.put("50", new Composer("50", "Hlompha", "Batsoali", "Post-Romantic"));
    }
    
}
