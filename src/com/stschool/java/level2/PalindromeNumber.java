package com.stschool.java.level2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number, reverse, originial, digit;
        System.out.println("Welcome to the Palindrome of a Number");
        System.out.println("Please Enter The Number");
        number = sc.nextInt();
        reverse = 0;
        originial = number;
        while (number > 0) {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }


        if (originial == reverse) {
            System.out.println("It Is An Palindrome Number");
        } else {
            System.out.println("It is not an Palindrome Number");
        }


        sc.close();
    }
}
