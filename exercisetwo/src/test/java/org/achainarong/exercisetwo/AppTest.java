package org.achainarong.exercisetwo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{

    @Test
    public void shouldReturnTheRightString()
    {
        String givenValues = "48 65 122";
        String expectedResult = "30 41 7a";
        String actualResult = App.ConvertStringToHex(givenValues);
        
        assertTrue(expectedResult.equals(actualResult));
    }
}
