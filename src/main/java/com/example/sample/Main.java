package com.example.sample;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        String[] parts = result.split(" ");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
