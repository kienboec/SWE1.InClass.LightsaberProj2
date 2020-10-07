package bif3.swe1.tdd;

import bif3.swe1.tdd.fighter.*;

public class Main {
    public static void main(String[] args) {

        Yoda yoda = new Yoda();
        DarthVader vader = new DarthVader();
        Luke luke = new Luke();

        System.out.println("Yoda has a lightsaber with color: " + yoda.getLightsaber().getColor());
        System.out.println("DarthVader has a lightsaber with color: " + vader.getLightsaber().getColor());
        System.out.println("Luke has a lightsaber with color: " + luke.getLightsaber().getColor());
    }
}
