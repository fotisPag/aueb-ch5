package gr.aueb.cf.ch5;

import java.util.Scanner;

/*
* Ελέγχει αν ένα τρίγωνο είναι ορθογώνιο.
*
* @author fotisPag
* */

public class RightTriangle {

    public static void main(String[] args) {

        //Δηλώσεις και αρχικοποιήσεις
        final double EPSILON = 0.05;
        Scanner in = new Scanner(System.in);
        double a,b,c;
        boolean isRight = false;

        System.out.println("Δώστε τα μήκη των τριών πλευρών του τριγώνου");

        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        //Έλεγχος αν το τρίγωνο είναι ορθογώνιο
        System.out.printf("%.4f %.4f%n", a*a, (b*b + c*c));
        isRight = (Math.abs(a*a - b*b - c*c) <= EPSILON);

        System.out.printf("Το τρίγωνο είναι ορθογώνιο", (isRight) ? "" : "ΔΕΝ");

    }

}
