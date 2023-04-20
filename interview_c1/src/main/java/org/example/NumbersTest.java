package org.example;

import java.util.ArrayList;
import java.util.List;

public class NumbersTest {

    public void testOperationShouldReturnEmptyListWhenInputValueIsZero() throws Exception {

        Number number = new Number();

        List<Integer> result = number.operation2(0, new ArrayList<>());

        assertEquals(0, result.size());
    }

    public void testOperationShouldReturnEmptyListWhenInputValueIsNegative() throws Exception {

        Number number = new Number();

        List<Integer> result = number.operation2(-10, new ArrayList<>());

        assertEquals(0, result.size());
    }

    public void testOperationShouldReturnFilledListWhenInputValueIsPositive() throws Exception {

        Number number = new Number();

        List<Integer> result = number.operation2(10, new ArrayList<>());

        assertTrue(result.size() > 1);
    }

}
