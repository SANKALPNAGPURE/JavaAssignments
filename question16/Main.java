package com.company.question16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AlphabetIsCharacterOrNot alphabetIsCharacterOrNot = new AlphabetIsCharacterOrNot();
        alphabetIsCharacterOrNot.alphabet('+');

        //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        alphabetIsCharacterOrNot.alphabet(ch);


    }
}
