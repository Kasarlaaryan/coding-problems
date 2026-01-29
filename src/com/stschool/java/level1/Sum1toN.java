package com.stschool.java.level1;

import java.util.Scanner;

public class Sum1toN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int number, i, sum ;
        System.out.println("Printing the Number from 1 to N");
        System.out.println("Please Enter the Number to Print sum of 1 to N");
        number = sc.nextInt();
        System.out.println("Your Number Is : " + number);
        i = 1;
        sum = 0;
        while (i <= number) {
            System.out.println("Number is : " + i);
            sum= sum+ i;
            System.out.println("Sum of the 1 to N  is : " + sum );
            i++;
        }





        sc.close();
    }
}
