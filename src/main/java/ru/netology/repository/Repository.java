package ru.netology.repository;

import ru.netology.domain.*;

public class Repository {

    private Film[] films = new Film[0];

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


    public Film findById(int id) {
        for (Film film : films) {
            if (film.getId() == id) {
                return film;
            }
        }
        return null;
    }


    public void removeById(int id) {
        Film[] tmp = new Film[films.length - 1];
        int copyToIndex = 0;
        for (Film item : films) {
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        films = tmp;
    }

    public void removeAll() {
        films = new Film[0];
    }
}
