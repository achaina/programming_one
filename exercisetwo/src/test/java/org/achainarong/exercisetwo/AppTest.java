package org.achainarong.exercisetwo;

import static org.junit.Assert.assertTrue;

import org.achainarong.exercisetwo.helper.HexcodeConverter;
import org.junit.Test;

public class AppTest 
{

    @Test
    public void shouldReturnTheRightString()
    {
        String givenValues = "48 65 122";
        String expectedResult = "48 30 \\u34\\u38";
        String actualResult = HexcodeConverter.ConvertStringToHex(givenValues);

        assertTrue(actualResult.contains(expectedResult));
    }
}
