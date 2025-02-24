package org.example; //DO NOT DELETE
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the number of gallons: ");
        Scanner input = new Scanner(System.in);
        double gallons = input.nextDouble();
        System.out.println("In " + gallons + " gallons there are:\n" + 4*gallons + " quarts\n" + 8*gallons + " pints\n" + 16*gallons + " cups\n" + 256*gallons + " tablespoons");
    }
}