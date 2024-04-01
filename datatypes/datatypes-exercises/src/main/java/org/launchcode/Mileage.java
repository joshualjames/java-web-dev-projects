package org.launchcode;

import java.util.Scanner;
public class Mileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven? ");
        Double miles = input.nextDouble();

        System.out.println("How many gallons of gas did you use? ");
        Double gallons = input.nextDouble();

        Double mpg = miles/gallons;
        System.out.println("You are averaging " + mpg + " mpg");
    }
}
