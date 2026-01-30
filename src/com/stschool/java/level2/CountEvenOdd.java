package com.stschool.java.level2;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, digit, oddCount, evenCount;
        System.out.println("Welcome to theCounting the Even and Odd digits in the Number");
        System.out.println("Please Enter The Number");
        number = sc.nextInt();
        oddCount = 0;
        evenCount = 0;
        while (number > 0) {
            digit = number % 10;
            if (digit % 2 == 0) {
                evenCount = evenCount + 1;
            } else {
                oddCount = oddCount + 1;
            }
            number = number / 10;
        }

        System.out.println("The Count of the Odd Digits are : " + oddCount);
        System.out.println("The Count of the event digits is  : " + evenCount);
        sc.close();
    }
}