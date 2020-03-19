package main;

import java.util.Random;

/**
 * The Shuffle class contains a single method {@link #generateShuffled(int)}
 */
public class Shuffle {
    private static Random random = new Random();

    /**
     * Generates an array of integers from 1 to n with a random order using the Fisher-Yates shuffle
     *
     * @param n The size of the array to generate
     * @return The shuffled array
     * @see <a href="https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle">Fisher-Yates shuffle</a>
     */
    public static int[] generateShuffled(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n cannot be less than 1");
        }

        int[] orderedArray = new int[n];
        int[] shuffledArray = new int[n];

        // Generate the ordered array
        for (int i = 0; i < n; i++) {
            orderedArray[i] = i + 1;
        }

        // Generate the shuffled array
        for (int i = 0; i < n; i++) {
            int size = (n - i);
            int pick = random.nextInt(size);
            shuffledArray[i] = orderedArray[pick];
            orderedArray[pick] = orderedArray[size - 1];
        }

        return shuffledArray;
    }
}
