package com.company.question17;

public class SumOfAllOddNumbers {
    public int odd(int n) {
        int sum= 0;
        for(int i=1;i<=n;i++){
            if (i%2!=0){
                sum=sum+i;
            }
        }
        return sum;
    }

    }
