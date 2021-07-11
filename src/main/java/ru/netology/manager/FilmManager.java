package ru.netology.manager;

import ru.netology.domain.FilmPoster;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class FilmManager {
    public int limitLength = 10;

    private FilmPoster[] films = new FilmPoster[0];

    public void addFilm(FilmPoster film) {
        int resultLenght = films.length + 1;
        FilmPoster[] tmp = new FilmPoster[resultLenght];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastImdex = tmp.length - 1;
        tmp[lastImdex] = film;
        films = tmp;
    }

    public int setLimitLength(int newLimitLength) {
        if (newLimitLength < 0) {
            return limitLength;
        }
        limitLength = newLimitLength;
        return limitLength;
    }

    public FilmPoster[] showLatestFilm() {
        int resultLength;
        if (films.length > limitLength) {
            resultLength = limitLength;
        } else {
            resultLength = films.length;
        }
        FilmPoster[] result = new FilmPoster[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }
}

