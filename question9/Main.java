package com.company.question9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CheckOddNumber checkOddNumber = new CheckOddNumber();
        checkOddNumber.odd(33);

        // user input
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Enter a number");
        int n = sc.nextInt();
        checkOddNumber.odd(n);

    }
}
