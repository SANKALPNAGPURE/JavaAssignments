package com.company.question14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberIsPositiveOrNegative numberIsPositiveOrNegative = new NumberIsPositiveOrNegative();
        numberIsPositiveOrNegative.check(-5);

        //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        numberIsPositiveOrNegative.check(n);
    }
}
