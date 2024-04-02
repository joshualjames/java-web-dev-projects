package org.launchcode;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r;
        do {
            System.out.print("What is the radius of the circle? Enter a positive number: ");
            while (!input.hasNextDouble()) {
                System.out.print("Error. Please enter a positive number: ");
                input.next();
            }
            r = input.nextDouble();
        } while (r < 0);
        double area = Circle.getArea(r);
        System.out.println("The area of the circle is " + area);
        input.close();
        }
    }

