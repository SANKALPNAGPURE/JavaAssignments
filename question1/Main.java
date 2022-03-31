package com.company.question1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AverageOfTwoNumbers averageOfTwoNumbers = new AverageOfTwoNumbers();
       double averageAnswer = averageOfTwoNumbers.average(10,20);
        System.out.println(averageAnswer);

        //user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double one= sc.nextDouble();
        double two= sc.nextDouble();
        double averageAnswer2 = averageOfTwoNumbers.average(one, two);
        System.out.println(averageAnswer2);



    }
}
