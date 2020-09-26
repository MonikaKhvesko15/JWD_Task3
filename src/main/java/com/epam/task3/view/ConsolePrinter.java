package com.epam.task3.view;

public class ConsolePrinter implements Printer {

    @Override
    public void Print(double carat, double price) {
        System.out.println("Total weight (carat) :" + carat);
        System.out.println("Total price: " + price);
    }
}
