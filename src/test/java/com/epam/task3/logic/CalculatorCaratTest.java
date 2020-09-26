package com.epam.task3.logic;

import com.epam.task3.entity.ConcreteStoneFactory;
import com.epam.task3.entity.InputType;
import com.epam.task3.entity.Stone;
import com.epam.task3.entity.StoneFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculatorCaratTest{
    @Test
    public void shouldCalculateCorrectCarat() {
        //given
        CalculateTotalStoneValue calculator = new CalculatorCarat();
        StoneFactory stoneFactory = new ConcreteStoneFactory();

        double excepted = 13.0;
        List<Stone> point = new ArrayList<>();
        point.add(stoneFactory.createStone(InputType.DIAMOND));

        //when
        double actual = calculator.calculateSum(point);
        //then
        Assert.assertEquals(excepted, actual, 0.001);
    }
        }
