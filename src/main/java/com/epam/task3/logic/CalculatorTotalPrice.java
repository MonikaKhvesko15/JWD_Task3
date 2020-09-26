package com.epam.task3.logic;

import com.epam.task3.entity.Stone;

import java.util.List;

public class CalculatorTotalPrice implements CalculateTotalStoneValue {
    public double calculateSum(List<Stone> necklace) {
        int result = 0;
        for (Stone i : necklace
        ) {
            result += i.getPrice();
        }
        return result;
    }
}
