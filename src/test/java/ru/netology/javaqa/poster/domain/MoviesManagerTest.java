package ru.netology.javaqa.poster.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {
    MoviesManager manager = new MoviesManager();

    @Test

    public void addingMovies() {

        manager.add("First");
        manager.add("Second");
        manager.add("Third");

        String[] expected = {"First", "Second", "Third"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void outputReverseOrder() {
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eighth");
        manager.add("Ninth");
        manager.add("Tenth");
        String[] expected = {"Tenth", "Ninth", "Eighth", "Seventh", "Sixth", "Fifth", "Fourth", "Third", "Second", "First"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void outputInReverseOrderLessThanTheLimit() {
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourth");
        manager.add("Fifth");

        String[] expected = {"Fifth", "Fourth", "Third", "Second", "First"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}
