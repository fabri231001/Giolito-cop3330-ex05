/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Fabrizio Giolito
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("What is the first number? ");
        Scanner s1 = new Scanner(System.in);
        int n1 = s1.nextInt();
        System.out.println("What is the second number? ");
        Scanner s2 = new Scanner(System.in);
        int n2 = s2.nextInt();
        System.out.println(n1 + " + " + n2 + " = " + (n1+n2) + "\n" + n1 + " - " + n2 + " = " + (n1-n2) + "\n"
                + n1 + " * " + n2 + " = " + (n1*n2) + "\n" + n1 + " / " + n2 + " = " + (n1/n2));

    }
}
