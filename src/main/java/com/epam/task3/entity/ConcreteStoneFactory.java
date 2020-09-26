package com.epam.task3.entity;

public class ConcreteStoneFactory implements StoneFactory {
    public Stone createStone(InputType inputType) {
        switch (inputType) {
            case RUBY:
                return new Ruby();
            case PEARL:
                return new Pearl();
            case DIAMOND:
                return new Diamond();
            case AGATE:
                return new Agate();
            default:
                throw new IllegalArgumentException("Unknown input type " + inputType);
        }
    }
}







