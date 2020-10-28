package org.achainarong.exercisetwo;

import static org.junit.Assert.assertTrue;

import org.achainarong.exercisetwo.helper.HexcodeConverter;
import org.junit.Test;

public class AppTest {

    @Test
    public void shouldContainTheRightString() {
        String givenValues = "48 65 122";
        String expectedResult = "122 7a \\u0031\\u0032\\u0032";
        String actualResult = HexcodeConverter.ConvertStringToHex(givenValues);

        assertTrue(actualResult.contains(expectedResult));
    }
}
