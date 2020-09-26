package com.epam.task3.view;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements Printer {

    public static final String FILE_OUTPUT_TXT = "output.txt";

    @Override
    public void Print(double carat, double price) throws IOException {
        String str = "Total weight(carat): " + carat +
                "\nTotal price: " + price;
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_OUTPUT_TXT));
        writer.write(str);

        writer.close();
    }
}
