package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmPoster;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FilmManagerNonEmptyTest {
    private FilmManager manager = new FilmManager();
    private FilmPoster film1 = new FilmPoster(1, 1010, "Чёрная вдова", "Боевик");
    private FilmPoster film2 = new FilmPoster(2, 2020, "Лука", "Комедия");
    private FilmPoster film3 = new FilmPoster(3, 3030, "Космический джем", "Комедия");
    private FilmPoster film4 = new FilmPoster(4, 4040, "Судная ночь навсегда", "Ужасы");
    private FilmPoster film5 = new FilmPoster(5, 5050, "Круэлла", "Комедия");
    private FilmPoster film6 = new FilmPoster(6, 6060, "Телохранитель жены киллера", "Боевик");
    private FilmPoster film7 = new FilmPoster(7, 7070, "Бугимен", "Ужасы");
    private FilmPoster film8 = new FilmPoster(8, 8080, "Оборотни внутри", "Ужасы");
    private FilmPoster film9 = new FilmPoster(9, 9090, "Бендер: Начало", "Драма");
    private FilmPoster film10 = new FilmPoster(10, 1000, "Огрики", "Комедия");
    private FilmPoster film11 = new FilmPoster(11, 1100, "Ледяной драйв", "Боевик");

    @BeforeEach
    public void setup() {
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
    }

    @Test
    public void addFilmIfManyFilms() {
        manager.addFilm(film6);
        FilmPoster[] actual = manager.showLatestFilm();
        FilmPoster[] expected = new FilmPoster[]{film6, film5, film4, film3, film2, film1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void setLimitLengthFilms() {
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);
        FilmPoster[] actual = manager.showLatestFilm();
        FilmPoster[] expected = new FilmPoster[]{film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        assertArrayEquals(expected, actual);
    }
}
