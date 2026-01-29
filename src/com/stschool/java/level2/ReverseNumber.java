package com.stschool.java.level2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number, reverse , digit;
        System.out.println("Welcome to the Reverse of a Number");
        System.out.println("Please Enter The Number");
        number = sc.nextInt();
        reverse = 0;

        while (number > 0){
            digit = number%10;
            reverse = (reverse * 10) + digit;
            number = number/10;
        }

        System.out.println("Reverse of a Number is : " + reverse);

        sc.close();

    }
}
