package ru.netology.PosterManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {
    String movie1 = "Movie 1";
    String movie2 = "Movie 2";
    String movie3 = "Movie 3";
    String movie4 = "Movie 4";
    String movie5 = "Movie 5";
    String movie6 = "Movie 6";
    String movie7 = "Movie 7";
    String movie8 = "Movie 8";
    String movie9 = "Movie 9";
    String movie10 = "Movie 10";
    String movie11 = "Movie 11";
    String movie12 = "Movie 12";
    String movie13 = "Movie 13";
    String movie14 = "Movie 14";


    @Test
    public void findAllTest() {
        PosterManager posterManager = new PosterManager();

        posterManager.add(movie1);
        posterManager.add(movie2);
        posterManager.add(movie3);
        posterManager.add(movie4);
        posterManager.add(movie5);

        String[] expected = {
                "Movie 1", "Movie 2", "Movie 3", "Movie 4", "Movie 5"
        };
        String[] actual = posterManager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void findLastTest() {
        PosterManager posterManager = new PosterManager();

        posterManager.add(movie1);
        posterManager.add(movie2);
        posterManager.add(movie3);
        posterManager.add(movie4);
        posterManager.add(movie5);
        posterManager.add(movie6);
        posterManager.add(movie7);


        String[] expected = {
                "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3", "Movie 2", "Movie 1"
        };
        String[] actual = posterManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void limitTest() {
        PosterManager posterManager = new PosterManager(8);

        posterManager.add(movie1);
        posterManager.add(movie2);
        posterManager.add(movie3);
        posterManager.add(movie4);
        posterManager.add(movie5);
        posterManager.add(movie6);
        posterManager.add(movie7);
        posterManager.add(movie8);
        posterManager.add(movie9);
        posterManager.add(movie10);
        posterManager.add(movie11);
        posterManager.add(movie12);
        posterManager.add(movie13);
        posterManager.add(movie14);

        String[] expected = {
                "Movie 14", "Movie 13", "Movie 12", "Movie 11", "Movie 10", "Movie 9", "Movie 8", "Movie 7"
        };
        String[] actual = posterManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void overLimit() {
        PosterManager posterManager = new PosterManager();

        posterManager.add(movie1);
        posterManager.add(movie2);
        posterManager.add(movie3);
        posterManager.add(movie4);
        posterManager.add(movie5);
        posterManager.add(movie6);
        posterManager.add(movie7);
        posterManager.add(movie8);
        posterManager.add(movie9);
        posterManager.add(movie10);
        posterManager.add(movie11);
        posterManager.add(movie12);

        String[] expected = {
                "Movie 12", "Movie 11", "Movie 10", "Movie 9", "Movie 8", "Movie 7", "Movie 6", "Movie 5", "Movie 4", "Movie 3"
        };
        String[] actual = posterManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void limit0() {
        PosterManager posterManager = new PosterManager(0);

        posterManager.add(movie1);
        posterManager.add(movie2);
        posterManager.add(movie3);

        String[] expected = {};
        String[] actual = posterManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void underLimit() {
        PosterManager posterManager = new PosterManager(6);

        posterManager.add(movie1);
        posterManager.add(movie2);
        posterManager.add(movie3);

        String[] expected = {
                "Movie 3", "Movie 2", "Movie 1"
        };
        String[] actual = posterManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
