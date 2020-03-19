package main;

import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
        shuffle(10000);
    }

    public static int[] shuffle(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be greater than 1");
        }

        Random random = new Random();
        int[] orderedArray = new int[n];
        int[] shuffledArray = new int[n];

        for (int i = 0; i < n; i++) {
            orderedArray[i] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            int size = (n - i - 1);
            int pick = size > 0 ? random.nextInt(size) : 0;
            shuffledArray[i] = orderedArray[pick];
            orderedArray[pick] = orderedArray[size];
        }

        return shuffledArray;
    }
}
