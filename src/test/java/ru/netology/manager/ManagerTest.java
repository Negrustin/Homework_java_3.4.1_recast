package ru.netology.manager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;


public class ManagerTest {

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
    public void emptyFilms() {

        Manager manager = new Manager();

        Film[] exception = {};
        Film[] actual = manager.findAll();

        Assertions.assertArrayEquals(exception, actual);
    }

    @Test
    public void save() {

        Manager manager = new Manager();
        manager.save(film1);

        Film[] excepted = {film1};
        Film[] actual = manager.findAll();

        Assertions.assertArrayEquals(excepted, actual);
    }

    @Test

    public void findLastFilms() {
        Manager manager = new Manager();

        manager.save(film1);
        manager.save(film2);

        Film[] excepted = {film2, film1};
        Film[] actual = manager.findLastFilms();

        Assertions.assertArrayEquals(excepted,actual);

    }

    @Test
    public void findLastFilmsOverMaxLimit(){
        Manager manager = new Manager();

        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);
        manager.save(film8);
        manager.save(film9);
        manager.save(film10);
        manager.save(film11);

        Film[] excepted = {film11,film10,film9,film8,film7,film6,film5,film4,film3,film2};
        Film[] actual = manager.findLastFilms();

        Assertions.assertArrayEquals(excepted,actual);

    }

    @Test
    public void findLastFilmsSetMaxLimit(){
        Manager manager = new Manager();
        manager.setMaxLimit(6);

        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);
        manager.save(film8);
        manager.save(film9);
        manager.save(film10);
        manager.save(film11);

        Film[] excepted = {film11,film10,film9,film8,film7,film6};
        Film[] actual = manager.findLastFilms();

        Assertions.assertArrayEquals(excepted,actual);

    }


}