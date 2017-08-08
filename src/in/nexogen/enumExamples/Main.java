package in.nexogen.enumExamples;

import java.util.Scanner;

import static in.nexogen.enumExamples.PlanetTest.Planet.EARTH;

/**
 * Created by dv on 4/8/17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter weight:");
        Scanner sc = new Scanner(System.in);
        String weight = sc.next();

        double earthWeight = Double.parseDouble(weight);
        double mass = earthWeight / EARTH.surfaceGravity();
        for (PlanetTest.Planet p : PlanetTest.Planet.values()) {
            System.out.printf("Your weight in %s is %f%n", p, p.surfaceWeight(mass));
        }
    }
}
