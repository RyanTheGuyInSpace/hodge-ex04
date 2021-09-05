/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Hodge
 */

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {

        // Prompt the user for a noun, verb, adverb and adjective using separate prompts
        // Store each of the parts of speech inside separate variables
        // Print out a store that uses each of the entered parts of speech appropriately

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a noun: ");
        String noun = scan.nextLine().toString();

        System.out.println("Enter a verb: ");
        String verb = scan.nextLine().toString();

        System.out.println("Enter an adverb: ");
        String adv = scan.nextLine().toString();

        System.out.println("Enter an adjective: ");
        String adj = scan.nextLine().toString();

        System.out.printf("My friends and I decided to use a %s in an attempt to %s " +
                "%s. It was a great experience, but in hindsight it was rather %s.",
                noun, adv, verb, adj);

    }
}
