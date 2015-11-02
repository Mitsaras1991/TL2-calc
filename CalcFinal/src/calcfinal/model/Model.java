/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcfinal.model;

/**
 *
 * @author JohnyWalker
 */
public class Model {
    
    public class Calculations {

        private double calculationValue = 0;
        public String operator;


        public void calculate(double firstNumber, double secondNumber) {
            switch(operator) {
                case "+" :
                    calculationValue = firstNumber + secondNumber;
                    getCalculationValue();
                    break;
                case "-":
                    calculationValue = firstNumber - secondNumber;
                    getCalculationValue();
                    break;
                case "x":
                    calculationValue = firstNumber * secondNumber;
                    getCalculationValue();
                    break;
                case "/":
                    calculationValue = firstNumber / secondNumber;
                    getCalculationValue();
                    break;
            }
        }
        
    public double getCalculationValue() {
            return calculationValue;
        }
    }
    
    
public class Percentage
    {
        private double calculationValue = 0;
        public String operator;
        
        public void perceentage(double firstNumber, double secondNumber)
        {
            switch (operator) {
                case "+":
                    calculationValue = firstNumber + ((secondNumber / 100) * firstNumber);
                    getCalculationValue();
                    break;
                case "-":
                    calculationValue = firstNumber - ((secondNumber / 100) * firstNumber);
                    getCalculationValue();
                    break;
                case "/":
                    calculationValue = firstNumber / ((secondNumber / 100) * firstNumber);
                    getCalculationValue();
                    break;
                case "x":
                    calculationValue = firstNumber * ((secondNumber / 100) * firstNumber);
                    getCalculationValue();
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
