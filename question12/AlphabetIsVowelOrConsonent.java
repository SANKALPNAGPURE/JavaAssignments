package com.company.question12;

public class AlphabetIsVowelOrConsonent {
    public void check(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println(ch + " is vowel");
        }
        else{
            System.out.println(ch+" is consonent");
        }
    }
}

