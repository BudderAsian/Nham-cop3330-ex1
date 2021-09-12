package com.example;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Richard Nham
 */

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);

        System.out.println("What is your name?");
        String fname = input.next();

        String output = "Hello, "+ fname +", nice to meet you!";

        System.out.print(output);



    }
}
