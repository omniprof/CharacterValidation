package com.cejv416.charactervalidation;

import java.util.Scanner;

/**
 * Sample code for console user input
 *
 * @author Ken Fogel
 */
public class CharacterValidation {

    /**
     * Example of console input control by a regular expression
     *
     * @return the character that the user entered
     */
    public char testCharacterInput() {
        // Declaration
        char ch;

        // Process
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a char from d to m: ");

            // Check if the characters in the keyboard buffer match the expression
            if (sc.hasNext("[d-mD-M]")) {
                ch = sc.next().toUpperCase().charAt(0);
            } else {
                // Cannot be a 'z' so force a failure in the while loop
                ch = 'z';
                System.out.println("Invalid. Please enter a char from d - m: ");
            }
            sc.nextLine(); // Clean out the keyboard buffer
        } while (ch == 'z');

        return ch;
    }

    /**
     * Carry out the steps in the correct sequence
     */
    public void perform() {
        char mychar = testCharacterInput();
        System.out.println("Char is :" + mychar);
    }

    /**
     * Where it all begins
     *
     * @param args
     */
    public static void main(String[] args) {
        new CharacterValidation().perform();
    }
}
