package com.stschool.java.level2;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, sum , digit;
        System.out.println("Welcome to the Sum of a Number");
        System.out.println("Please Enter The Number");
        number = sc.nextInt();
        sum = 0;
        while (number > 0 ){
            digit = number%10;
            sum = sum + digit;
            number = number /10;

        }

        System.out.println("Sum of the Digits in a number is : " + sum);
        sc.close();
    }
}
