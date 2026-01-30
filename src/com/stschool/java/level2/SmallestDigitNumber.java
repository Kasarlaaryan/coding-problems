package com.stschool.java.level2;

import java.util.Scanner;

public class SmallestDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, digit, smallestNumber;
        System.out.println("Welcome to the finding the Smallest Digit in a Number");
        System.out.println("Please Enter The Number");
        number = sc.nextInt();
        smallestNumber = number%10;
        while (number > 0) {
            digit = number % 10;

            if (digit < smallestNumber) {
                smallestNumber = digit;
            }
            number = number / 10;

        }

        System.out.println("The Smallest Number is : " + smallestNumber);
        sc.close();
    }
}
