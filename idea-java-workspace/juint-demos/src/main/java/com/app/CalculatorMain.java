package com.app;

public class CalculatorMain {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        var a= 10;
        var b= 20;
        var output = calc.add(a,b);

        System.out.println(a+" + "+b+" = "+output);
    }

}
