package com.example.sample;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers and an operator (e.g 1 + 2): ");
        String result = scanner.nextLine();
        String[] parts = result.split(" ");

        Calculator calculator = new Calculator();

        long num1 = Long.parseLong(parts[0]);
        long num2 = Long.parseLong(parts[2]);
        String operator = parts[1];
        long answer = calculator.calculate(num1, operator, num2);
        System.out.println(answer);
    }
}
