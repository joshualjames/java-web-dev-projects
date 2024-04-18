package org.launchcode;

import org.launchcode.HouseCat;

public class Main {
    public static void main(String[] args) {
        HouseCat beau = new HouseCat("Beau", 12);
        beau.eat();
        System.out.println(beau.isTired());
        System.out.println(beau.noise());
    }
    }

