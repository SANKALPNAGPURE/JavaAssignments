package com.company.question16;

public class AlphabetIsCharacterOrNot {
    public void alphabet(char ch){
        if(ch>='a' &&ch<='z'|| ch>='A'&&ch<='Z'){
            System.out.println(ch+" is alphabet character");
        }
        else{
            System.out.println(ch+" is not alphabet character");
        }

    }
}
