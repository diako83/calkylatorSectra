package org.example;

public interface IServices {
    double inputDouble(String text);
    char inputOperator(String text);
    double calculation(double firstNumber, char operator, double secondNumber);
    boolean exit();

    String inputString();
}
