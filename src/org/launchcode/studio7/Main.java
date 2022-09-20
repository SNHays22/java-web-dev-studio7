package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD("Jagged Little Pill", 42, "Readable");
        DVD dvd = new DVD("Sharknado 3", 3, "Guilty Pleasure");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.spinDisc();
        cd.readDisc();

        dvd.spinDisc();
        dvd.readDisc();
    }
}
