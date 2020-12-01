package org.achainarong.exercisesix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.io.IOException;

public class CharArrayOpsTest {
    @Test
    void exchangingCharacterShouldReturnExpectedCharArray() throws IOException {
        var result = CharArrayOps.exchangeCharactersByParameterInput("acadda".toCharArray(), 'a', 'b');

        var expected = "bcbddb".toCharArray();
        assertArrayEquals(expected, result);
    }

    @Test
    void subArrayShouldExistInMainArray() throws IOException {
        var mainCharArray = "aaaha".toCharArray();
        var subCharArray = "aah".toCharArray();
        var result = CharArrayOps.CheckIfCharrayContainsSubArray(mainCharArray, subCharArray);
        int expected = 2;

        assertEquals(expected, result);
    }

    @Test
    void SubArrayShouldNotExistInMainArray() throws IOException {
        var mainCharArray = "aaaha".toCharArray();
        var subCharArray = "aaaa".toCharArray();
        var result = CharArrayOps.CheckIfCharrayContainsSubArray(mainCharArray, subCharArray);
        int expected = -1;

        assertEquals(expected, result);
    }
}
