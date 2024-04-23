package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("Backstreet Boys", "CD", 500, 200);
        DVD dvd = new DVD("Backstreet Boys Live", "DVD", 800, 400);
        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.spinDisc();
        dvd.spinDisc();

        cd.storeData(600);
        cd.storeData(200);
        dvd.storeData(300);

        cd.writeData(100, "CD content");
        dvd.writeData(200, "Birthday Party");
        cd.diskInfo();
    }
}