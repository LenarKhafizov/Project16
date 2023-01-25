package ru.netology;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t Домашнее задание по теме: \"Структурные шаблоны. Proxy, Decorator, Adapter.\"");
        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.MULT)
                        .result());
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
    }
}
