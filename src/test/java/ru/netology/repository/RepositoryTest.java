package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import java.net.http.HttpResponse;

public class RepositoryTest {

    Film film1 = new Film(1, "Film1", 1991);
    Film film2 = new Film(2, "Film2", 1992);
    Film film3 = new Film(3, "Film3", 2003);
    Film film4 = new Film(4, "Film4", 2004);
    Film film5 = new Film(5, "Film5", 2005);
    Film film6 = new Film(6, "Film6", 2006);
    Film film7 = new Film(7, "Film7", 2007);
    Film film8 = new Film(8, "Film8", 2008);
    Film film9 = new Film(9, "Film9", 2019);
    Film film10 = new Film(10, "Film10", 2010);
    Film film11 = new Film(11, "Film11", 2011);


    @Test

    public void save() {
        Repository repo = new Repository();
        repo.save(film1);

        Film[] excepted = {film1};
        Film[] actual = repo.findAll();

        Assertions.assertArrayEquals(excepted, actual);

    }

    @Test

    public void findByExistingId() {
        Repository repo = new Repository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);

        Film expected = film2;
        Film actual = repo.findById(2);

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void findByNotExistingId() {
        Repository repo = new Repository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);

        Film expected = null;
        Film actual = repo.findById(65);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void removeAll() {
        Repository repo = new Repository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);

        repo.removeAll();

        Film[] expected = {};
        Film[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeToIndex() {
        Repository repo = new Repository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);

        repo.removeById(2);

        Film[] expected = {film1, film3};
        Film[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);


    }
}