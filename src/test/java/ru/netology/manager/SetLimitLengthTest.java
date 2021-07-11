package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import ru.netology.domain.FilmPoster;

public class SetLimitLengthTest {
    FilmManager manager = new FilmManager();

    @Test
    public void setlimitLengthZero() {
        int currentLimitLength = 0;
        manager.setLimitLength(currentLimitLength);
        int expected = 0;
        int actual = manager.getLimitLength();
        assertEquals(expected, actual);
    }

    @Test
    public void setlimitLengthUnderZero() {
        int currentLimitLength = -1;
        manager.setLimitLength(currentLimitLength);
        int expected = 10;
        int actual = manager.getLimitLength();
        assertEquals(expected, actual);
    }

    @Test
    public void setlimitLengthOverZero() {
        int currentLimitLength = 1;
        manager.setLimitLength(currentLimitLength);
        int expected = 1;
        int actual = manager.getLimitLength();
        assertEquals(expected, actual);
    }

    @Test
    public void setlimitLengthRandom() {
        int currentLimitLength = 11;
        manager.setLimitLength(currentLimitLength);
        int expected = 11;
        int actual = manager.getLimitLength();
        assertEquals(expected, actual);
    }
}