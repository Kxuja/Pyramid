package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(in );
        int n = sc.nextInt();
        System.out.println("Insert number: ");
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }


        for(int i = n-1;i>=0;i--) {

            for (int j = n; j > i; j--) {
                System.out.print("");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

