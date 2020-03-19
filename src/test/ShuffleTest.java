package test;

import main.Shuffle;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class ShuffleTest {
    @Test
    void testShuffle() {
        testShuffleHelper(1);
        testShuffleHelper(1000);
    }

    private void testShuffleHelper(int n) {
        Set<Integer> numbers = new HashSet<>();
        int[] shuffled = Shuffle.shuffle(n);

        assertEquals(n, shuffled.length);

        for (int number : shuffled) {
            numbers.add(number);
        }

        for (int i = 1; i <= n; i++) {
            assertTrue(numbers.contains(i));
        }
    }

    @Test
    void testShuffleIllegalArgument() {
        testShuffleIllegalArgumentException(0);
        testShuffleIllegalArgumentException(-100);
    }

    private void testShuffleIllegalArgumentException(int n) {
        Exception exception = assertThrows(RuntimeException.class, () -> Shuffle.shuffle(n));

        String expectedMessage = "n must be greater than 1";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
