package com.stschool.java.level2;

import java.util.Scanner;

public class LargestDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, digit, largeNumber;
        System.out.println("Welcome to the finding the Largest Digit in a Number");
        System.out.println("Please Enter The Number");
        number = sc.nextInt();
        largeNumber = 0;
        while (number > 0) {
            digit = number % 10;

            if (digit > largeNumber) {
                largeNumber = digit;
            }
            number = number / 10;

        }

        System.out.println("The Largest Number is : " + largeNumber);
        sc.close();
    }
}
