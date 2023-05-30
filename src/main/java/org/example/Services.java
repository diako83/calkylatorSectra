package org.example;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Services implements IServices {
    Scanner scanner = new Scanner(System.in);

    public double inputDouble(String text){
        while (true) {
            try {
                System.out.println(text);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. try again");
                scanner.nextLine();
            }
        }
    }


    public char inputOperator(String text) {
        System.out.println(text);
        char operator;
        do {
            operator = scanner.next().charAt(0);

            if (operator != '/' && operator != '*' && operator != '-' && operator != '+') {
                System.out.println("Invalid operator. Please enter /, *, -, or +");
            }
        } while (operator != '/' && operator != '*' && operator != '-' && operator != '+');

        return operator;
}
    public double calculation(double firstNumber, char operator, double secondNumber){

        double result = 0;
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            default:
                System.out.println("Invalid input. try again");

        }
        return result;
    }


    public String inputString(){
        String input="";
            try {
                input = scanner.next();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. try again");
                scanner.nextLine();
            }
        return input.toLowerCase();
    };

    public boolean exit(){
        System.out.print("To exit program press e ");
        System.out.print("For new calculation input any other character press enter");
        String exit = inputString();

        if (Objects.equals(exit, "e")){
           return false;
        }
        return true;
    }
}
