package com.stschool.java.level2;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, originalNumber, temp, digit, count, sum, i;
        System.out.println("Welcome to the Armstrong of a Number");
        System.out.println("Please Enter The Number");
        number = sc.nextInt();
        originalNumber = number;
        temp = number;
        count = 0;
        sum =0 ;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        while (originalNumber > 0){
            digit = originalNumber % 10;
            int power =1;
            for (i = 1; i<= count ; i++){
                power = power * digit;
            }
                sum = sum+power;
            originalNumber = originalNumber/10;

        }

        if (sum == number){
            System.out.println(" It is an Armstrong Number");
        }else {
            System.out.println(" It is Not an Armstrong Number");
        }


        sc.close();
    }
}
