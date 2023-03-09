package bsu.comp152;

import java.util.Scanner;

/**
 * RefugeRunner -
 * A class for Project 3, COMP 152
 *
 * The project is inspired by John Santore (Project University) and modified by Zach Resmer and Laura Gross.
 *
 * Starter code by: Laura K. Gross, laura.gross@bridgew.edu, 2/2023
 *
 * Completed by: [student name], [student email], [date of completion]
 */
public class RefugeRunner {

    private Scanner keyboard;
    private WildlifeRefuge refuge;

    public RefugeRunner() {
        // Initialize instance variable keyboard with a new Scanner object, passing in System.in as an argument.
        keyboard = new Scanner(System.in);
        refuge = null;
    }

    public void runRefuge(WildlifeRefuge wlr){
        refuge = wlr;
    }
}
