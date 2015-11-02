/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcfinal.model;

/**
 *
 * @author dimit
 */
public class NewModel
{
    private double calculationValue;
    private String operator;
    
    public void calculate(double firstNumber, double secondNumber)
    {
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
    
    public void percentage(double firstNumber, double secondNumber, String percentageOperator)
        {
            operator = percentageOperator;
            
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
    
    public class Root
    {
        public double squareRoot(double number)
        {            
            return Math.sqrt(number);
        }
    }
    
    public double getCalculationValue()
    {
        return calculationValue;
    }
    
    public void setOperator(String theOperator)
    {
        operator = theOperator;
    }
}
