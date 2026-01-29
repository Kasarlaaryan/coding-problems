package com.stschool.java.level1;

import java.util.Scanner;

public class CountDigitsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, count;
        System.out.println("Welcome to Counting Digit of a Number");
        System.out.println("Please Enter the Number you want to Count the digits in a number");
        number = sc.nextInt();
        count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        System.out.println(" the total Number in the digits are : " + count);


        sc.close();
    }
}
