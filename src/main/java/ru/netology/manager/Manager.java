package ru.netology.manager;

import ru.netology.domain.Film;
import ru.netology.repository.Repository;


public class Manager {
    private Repository repo;


    public Manager(Repository repo) {

        this.repo = repo;
    }

    private int maxLimit = 10;

    public int getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(int maxLimit) {

        this.maxLimit = maxLimit;
    }


    public Manager(Repository repo, int maxLimit) {
        this.repo = repo;
        this.maxLimit = maxLimit;
    }

    public void save(Film film) {
        repo.save(film);
    }

    public Film[] findAll() {
        return repo.findAll();
    }


    public Film[] findLastFilms() {


        Film[] all = repo.findAll();
        int resultLength;
        if (maxLimit >= 0 && maxLimit < all.length) {
            resultLength = maxLimit;
        } else {
            resultLength = all.length;
        }

        Film[] tmp = new Film[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = all[all.length - 1 - i];
        }
        return tmp;
    }


}





