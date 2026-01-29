package com.stschool.java.level2;

import java.util.Scanner;

public class ProductOfNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number, product, digit;
        System.out.println("Welcome to the Product of a Number");
        System.out.println("Please Enter The Number");
        number = sc.nextInt();
        product = 1;

        while (number > 0) {
            digit = number % 10;
            product = product * digit;
            number = number / 10;

        }
        System.out.println(" Product of the Number is :" + product);
        sc.close();
    }
}
