/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JohnyWalker
 */
public class CalculatorModel {
    
    public class Calculations {

        private double calculationValue = 0;
        public String operator;


        public void calculate(double firstNumber, double secondNumber) {
            switch(operator) {
                case "+" :
                    calculationValue = firstNumber + secondNumber;
                    setCalculationValue(calculationValue);
                    break;
                case "-":
                    calculationValue = firstNumber - secondNumber;
                    setCalculationValue(calculationValue);
                    break;
                case "x":
                    calculationValue = firstNumber * secondNumber;
                    setCalculationValue(calculationValue);
                    break;
                case "/":
                    calculationValue = firstNumber / secondNumber;
                    setCalculationValue(calculationValue);
                    break;
            }
        }
        
        public double setCalculationValue(double calculationValue) {
            return calculationValue;
        }


        public double getCalculationValue() {
            return calculationValue;
        }
    }
    
    public class Factorial
    {
        public double factorial(double number) {
            double calculationValue = 1; // this  will be the result
            for (int i = 1; i <= number; i++) {
                calculationValue *= i;
            }
            return calculationValue;
        }
    }
    
    public class Log
    {
        public double log(double number)
        {
            double calculationValue = Math.log(number);
            return calculationValue;        
        }
    }
    
    public class Percentage
    {
        public double calculationValue = 0;
        public String operator;
        
        public void perceentage(double firstNumber, double secondNumber)
        {
            switch (operator) {
                case "+":
                    calculationValue = firstNumber + ((secondNumber / 100) * firstNumber);
                    break;
                case "-":
                    calculationValue = firstNumber - ((secondNumber / 100) * firstNumber);
                    break;
                case "/":
                    calculationValue = firstNumber / ((secondNumber / 100) * firstNumber);
                    break;
                case "x":
                    calculationValue = firstNumber * ((secondNumber / 100) * firstNumber);
                    break;
                default:
                    break;
            }
        }

        public double getCalculationValue()
        {
            return calculationValue;
        }
    }
    
    public class Root
    {
        public double squareRoot(double number)
        {
            double calculationValue = Math.sqrt(number);
            return calculationValue;
        }
    }
}
