package com.calc;


/**
 * Created by alex on 12.2.17.
 */ class Calculator implements CalculatorService {
    @Override
    public double add(double input1, double input2) {
        return input1 + input2;
    }

    @Override
    public double subtract(double input1, double input2) {
        throw new UnsupportedOperationException("Method not implemented yet!");
    }

    @Override
    public double multiply(double input1, double input2) {
        throw new UnsupportedOperationException("Method not implemented yet!");
    }

    @Override
    public double divide(double input1, double input2) {
        throw new UnsupportedOperationException("Method not implemented yet!");
    }
}