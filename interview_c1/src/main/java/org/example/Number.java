package org.example;

import java.util.Collections;
import java.util.List;

public class Number {

    public List<Integer> operation2(int value, List<Integer> resultList) throws Exception {

        if (value <= 0) {
            return Collections.emptyList();
        }

        if (value == 1) {
            return resultList;
        }

        if (value % 2 == 0) {
            value /= 2;
        } else {
            value = value * 3 + 1;
        }
        resultList.add(value);

        return operation2(value, resultList);

    }

}
