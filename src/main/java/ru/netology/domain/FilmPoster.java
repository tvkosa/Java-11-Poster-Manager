package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class FilmPoster {
    private int id;
    private int filmUrl;
    private String name;
    private String genre;
}
