package org.launchcode;

import java.util.Scanner;

import static java.lang.Double.isNaN;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r;
        System.out.print("What is the radius of the circle? Enter a positive number: ");
        do {
            r = input.nextDouble();
            if (isNaN(r) || r < 0) {
                System.out.print("Error. Please enter a positive number: ");
            }
        } while (r < 0);
        double area = Circle.getArea(r);
        System.out.println("The area of the circle is " + area);
        input.close();
        }
    }

