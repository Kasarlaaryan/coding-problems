package com.stschool.java.patterns;

import java.util.Scanner;

public class FloydsTriangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, num;
        System.out.println("Please enter the Number of Rows you need ");
        row = sc.nextInt();
        num = 1;
        char ch = 'A';

        for (int i = 1; i <= row; i++) {
//            for (int space = row - i; space >= 1; space--) {
//                System.out.print(" ");
//            }
            for (int j = 1; j <= row; j++) {
                System.out.print( ch + " ");
                ch ++;

            }
            System.out.println();
        }
        sc.close();

    }
}
