package com.bk;

import com.bk.animals.Cat;

import java.util.Scanner;

public class Main {
    private String message;


    public static void main(String[] args) {
        Cat cat = new Cat("dsa", 4);
        Scanner scanner = new Scanner(System.in);
        double number1 = Double.parseDouble(scanner.next());
        double number2 = Double.parseDouble(scanner.next());
        String command = scanner.next();

        switch (command) {
            case "+":
                System.out.println(Calculator.add(number1, number2));
                break;
            case "-":
                System.out.println(Calculator.sub(number1, number2));
                break;
            case "/":
                System.out.println(Calculator.divine(number1, number2));
                break;
            case "*":
                System.out.println(Calculator.multiply(number1, number2));
                break;
            default:
                System.out.println("Error command");
        }

    }


}
