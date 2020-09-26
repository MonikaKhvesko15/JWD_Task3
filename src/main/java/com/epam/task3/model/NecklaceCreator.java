package com.epam.task3.model;

import com.epam.task3.entity.ConcreteStoneFactory;
import com.epam.task3.entity.InputType;
import com.epam.task3.entity.Stone;
import com.epam.task3.entity.StoneFactory;

import java.util.ArrayList;
import java.util.List;

public class NecklaceCreator {
    public List<Stone> createNecklace() {
        List<Stone> necklace = new ArrayList<>();
        StoneFactory stoneFactory = new ConcreteStoneFactory();
        necklace.add(stoneFactory.createStone(InputType.AGATE));
        necklace.add(stoneFactory.createStone(InputType.DIAMOND));
        necklace.add(stoneFactory.createStone(InputType.RUBY));
        necklace.add(stoneFactory.createStone(InputType.PEARL));
        return necklace;
    }
}
