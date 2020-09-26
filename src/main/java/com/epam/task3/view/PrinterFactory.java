package com.epam.task3.view;

public class PrinterFactory implements Factory{

    @Override
    public Printer printerData(OutputType outputMethod) {
        switch (outputMethod) {
            case CONSOLE:
                return new ConsolePrinter();
            case FILE:
                return new FilePrinter();
            default:
                throw new IllegalArgumentException("Unknown output method " +outputMethod );
        }
    }
}
