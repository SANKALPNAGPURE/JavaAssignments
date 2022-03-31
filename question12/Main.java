package com.company.question12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AlphabetIsVowelOrConsonent alphabetIsVowelOrConsonent = new AlphabetIsVowelOrConsonent();
        alphabetIsVowelOrConsonent.check('a');

        // user input
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter an Alphabet");
        char ch = sc.next().charAt(0);
        alphabetIsVowelOrConsonent.check(ch);

    }
}
