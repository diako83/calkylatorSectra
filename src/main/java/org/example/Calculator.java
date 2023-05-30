package org.example;


public class Calculator {


    public void  mainCalculator(){
        Services services = new Services();
        boolean exit = true;
        while (exit) {


            System.out.println("Welcome to quick calculator");
            double firstNumber = services.inputDouble("Enter first number ");

            char operator = services.inputOperator("Enter   +,  -  ,   /,   or  * ");
            System.out.println(operator);

            double secondNumber = services.inputDouble("Enter second number ");

            double result = services.calculation(firstNumber, operator, secondNumber);
            System.out.println("result : " + result);



            exit = services.exit();
        }
    }

}
