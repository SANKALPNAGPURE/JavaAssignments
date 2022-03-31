package com.company.question13;

public class LargestAmongThreeNumbers {
    public int largest(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }
        else if (b>a && b>c){
            return b;
        }
        else{
           return c;
        }
    }
}
