package com.stschool.java.level1;

import java.util.Scanner;

public class OddNumber1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, i;
        System.out.println("Printing the Number from 1 to N");
        System.out.println("Please Enter the Number to Print odd Number from 1 to N");
        number = sc.nextInt();
        System.out.println("Your Number Is : " + number);
        i = 1;
        while (i <= number) {

            if (i % 2 != 0) {
                System.out.println("this is an Odd Number  from from 1 to " + number + " is : " + i);
            }

            i++;

        }
        sc.close();
    }
}
