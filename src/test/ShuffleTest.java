package test;

import main.Shuffle;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class ShuffleTest {
    @Test
    void testGenerateShuffled() {
        testGenerateShuffledHelper(1);
        testGenerateShuffledHelper(1000);
    }

    private void testGenerateShuffledHelper(int n) {
        Set<Integer> numbers = new HashSet<>();
        int[] shuffled = Shuffle.generateShuffled(n);

        assertEquals(n, shuffled.length);

        for (int number : shuffled) {
            numbers.add(number);
        }

        for (int i = 1; i <= n; i++) {
            assertTrue(numbers.contains(i));
        }
    }

    @Test
    void testGenerateShuffledIllegalArgument() {
        testGenerateShuffledIllegalArgumentHelper(0);
        testGenerateShuffledIllegalArgumentHelper(-100);
    }

    private void testGenerateShuffledIllegalArgumentHelper(int n) {
        Exception exception = assertThrows(RuntimeException.class, () -> Shuffle.generateShuffled(n));

        String expectedMessage = "n cannot be less than 1";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
