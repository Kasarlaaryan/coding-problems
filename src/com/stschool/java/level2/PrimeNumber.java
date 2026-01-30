package com.stschool.java.level2;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, reverse, originial, digit;
        System.out.println("Welcome to the Prime of a Number");
        System.out.println("Please Enter The Number");
        number = sc.nextInt();

        if (number <= 1) {
            System.out.println("Not a Prime Number");
        }

        boolean flag = true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("It a Prime Number");
        } else {
            System.out.println("its not a  prime number");
        }

    }
}
