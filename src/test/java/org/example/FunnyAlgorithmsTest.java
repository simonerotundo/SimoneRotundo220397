package org.example;

import org.testng.annotations.Test;
import static junit.framework.Assert.assertEquals;

public class FunnyAlgorithmsTest {

    @Test
    public void stringToIntTest() {
        String s = "123";

        int expected = 123;
        int actual = FunnyAlgorithms.stringToIntConverter(s);

        assertEquals(expected, actual);
    }

}
