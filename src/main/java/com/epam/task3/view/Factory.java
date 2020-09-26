package com.epam.task3.view;

import com.epam.task3.entity.InputType;

public interface Factory {
    public Printer printerData(OutputType outputType);
}
