package com.string_lab;

import java.util.Scanner;

public class EndsWithAnotherString
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter the string: ");
        String sc1 = scanner.nextLine();

        // Input the string to check
        System.out.print("Enter the string to check if it ends with: ");
        String sc2 = scanner.nextLine();

        // Check if the mainString ends with the endString
        boolean endsWith = checkEndsWith(sc1, sc2);

        // Display the result
        if (endsWith) {
            System.out.println("The string ends with " + sc2);
        } else {
            System.out.println("The string does not end with " + sc2);
        }

       
    }

    // Method to check if a string ends with another string
    public static boolean checkEndsWith(String mainString, String endString)
    {
        // Using the endsWith method of the String class to perform the check
        return mainString.endsWith(endString);
    }
}
