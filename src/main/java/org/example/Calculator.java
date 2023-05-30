package org.example;


import java.util.Objects;

public class Calculator {



    public void  mainCalculator(){
        Services services = new Services();
        double firstNumber = 0.0;
        boolean exit = true;
        while (exit) {

            if (firstNumber > 0.0) {
                System.out.println("Clear all values? press y. Else input any value end enter ");
               if(Objects.equals(services.inputString(), "y")){
                   firstNumber = 0.0;
               }
            }


            System.out.println("Welcome to quick calculator");
            if (firstNumber > 0.0) {
                 double additional =       services.inputDouble("Enter first number ");
               firstNumber = firstNumber + additional;
            }
            else
            firstNumber = services.inputDouble("Enter first number ");

            char operator = services.inputOperator("Enter   +,  -  ,   /,   or  * ");
            System.out.println(operator);

            double secondNumber = services.inputDouble("Enter second number ");

            double result = services.calculation(firstNumber, operator, secondNumber);
            System.out.println("result : " + result);



            exit = services.exit();
        }
    }

}
