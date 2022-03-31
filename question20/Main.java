package com.company.question20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.table(8);

        //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        multiplicationTable.table(n);
    }
}
