package ru.netology;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            final Random rand = new Random();
            final int number = min + rand.nextInt(max - min + 1);

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return number;
            }
        };
    }
}

