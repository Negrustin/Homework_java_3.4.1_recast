package ru.netology.manager;

import ru.netology.domain.Film;


public class Manager{
    private int maxLimit;
    private Film[] films = new Film[0];

    public Manager() {
        this.maxLimit = 10;
    }

    public void setMaxLimit(int maxLimit) {
        this.maxLimit = maxLimit;
    }

    public void save(Film film) {
        Film[] tmp = new Film[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Film[] findAll() {
        return this.films;
    }


    public Film[] findLastFilms(){
        int resultLength;

        if (films.length < maxLimit) {
            resultLength = films.length;
        } else {
            resultLength = maxLimit;
        }

        Film[] tmp = new Film[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}





