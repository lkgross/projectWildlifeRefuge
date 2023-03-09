package bsu.comp152;

import java.util.ArrayList;

/**
 * Animal -
 * A class for Project 3, COMP 152
 *
 * The project is inspired by John Santore (Project University) and modified by Zach Resmer and Laura Gross.
 *
 *  Starter code by: Laura K. Gross, laura.gross@bridgew.edu, 2/2023
 *
 *
 * Completed by: [student name], [student email], [date of completion]
 */
public class Animal {

    private String type;
    private boolean stayWhenHealthy;

    public Animal(String ty, ArrayList<String> inj, boolean stay){

    }

    public String getType() {
        return type;
    }

    public boolean shouldKeepWhenHealthy() {
        return stayWhenHealthy;
    }

    public ArrayList<String> getInjuries() {
        return null;
    }

    public boolean shouldBeReleased() {
        return false;
    }

    @Override
    public String toString() {
        return "";
    }

    public void setRehabilitator(Rehabilitator rehabilitator) {

    }

    public void healInjury(String injuryName) {

    }
}