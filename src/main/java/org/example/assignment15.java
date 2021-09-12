/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Tony Tang
 */

package org.example;
import java.util.Scanner;
import java.lang.String;

public class assignment15 {

    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the password? ");
        String password = scan.nextLine();

        String correct = "abc$123";

        if(password.equals(correct)) {

            System.out.println("Welcome.");

        } else {
            System.out.println("I don't know you.");
        }

    }
}