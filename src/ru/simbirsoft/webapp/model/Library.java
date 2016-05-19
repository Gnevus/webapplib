package ru.simbirsoft.webapp.model;

/**
 * Created by Admin on 17.05.16.
 */
public class Library {
    private final String Name;
    private final String Autor;
    private final String Year;
    private final String Page;

    public Library(String name, String autor, String year, String page) {
        Name = name;
        Autor = autor;
        Year = year;
        Page = page;
    }
}
