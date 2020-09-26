package com.epam.task3;

//Stones. Choose stones for necklace. Calculate total weight (carat) and price.

import com.epam.task3.entity.Stone;
import com.epam.task3.logic.CalculateTotalStoneValue;
import com.epam.task3.logic.CalculatorCarat;
import com.epam.task3.logic.CalculatorTotalPrice;
import com.epam.task3.model.NecklaceCreator;
import com.epam.task3.view.Factory;
import com.epam.task3.view.OutputType;
import com.epam.task3.view.PrinterFactory;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        //create necklace
        NecklaceCreator necklaceCreator = new NecklaceCreator();
        List<Stone> necklace = necklaceCreator.createNecklace();

        //calculation
        CalculateTotalStoneValue calculatePrice = new CalculatorTotalPrice();
        CalculateTotalStoneValue calculateCarat = new CalculatorCarat();

        double totalPrice = calculatePrice.calculateSum(necklace);
        double totalCarat = calculateCarat.calculateSum(necklace);

        //output results
        Factory printFactory = new PrinterFactory();
        printFactory.printerData(OutputType.FILE).Print(totalCarat, totalPrice);
        printFactory.printerData(OutputType.CONSOLE).Print(totalCarat, totalPrice);

    }
}
