package day_3.exeption;

import day_2.Calculator;

public class ChechException {
    public static void main(String[] args) {
        //Make your own Exception implementation. Use it in your CalcApp
        Calculator.divide(3,0);
    }
}
