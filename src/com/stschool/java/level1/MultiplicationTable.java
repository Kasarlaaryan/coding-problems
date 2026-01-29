package com.stschool.java.level1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, i, result;
        System.out.println("Printing the Multiplication of a Number ");
        System.out.println("Please Enter the Number that you want the table of its");
        number = sc.nextInt();
        System.out.println("Your Number Is : " + number);
        i = 1;
        while (i <= 10) {
            result = number * i;
            System.out.println(number +  " * " + i + " = " +  result );
            i++;
        }


        sc.close();
    }
}
