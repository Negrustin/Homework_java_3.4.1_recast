package ru.netology.domain;

public class Film {
    private int id;
    private String name;
    private int yearOfProduction;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public Film() {
    }

    public Film(int id, String name, int yearOfProduction) {
        this.id = id;
        this.name = name;
        this.yearOfProduction = yearOfProduction;
    }

}


