package com.example.classmath.dto;

public class MathRequestDTO{
    private double firstNumber;
    private double secondNumber;
    private double result;

    public double getFirstNumber() { return firstNumber; }
    public double getSecondNumber() { return secondNumber; }
    public double getResult() { return result; }

    public double setResult(double result) { this.result = result; return this.result; }
    public void setFirstNumber(double firstNumber) { this.firstNumber = firstNumber; }
    public void setSecondNumber(double secondNumber) { this.secondNumber = secondNumber; }
}



