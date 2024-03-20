package gr.aueb.cf.ch5;

import java.util.Scanner;


/*
* Υλοποιεί έναν απλό υπολογιστή τσέπης
*
* @author fotisPag
* */


public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        int num1 = 0, num2 = 0;

        do {

            showMenu();
            choice = in.nextInt();

            if ((choice >= 1) && (choice <= 5)){
                System. out.println("Δώστε δύο αριθμούς");
                num1 = in.nextInt();
                num2 = in.nextInt();
            }

            switch (choice) {

                case 1:
                    System.out.println("Άθροισμα: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Άφαίρεση: " + sub(num1, num2));
                    break;
                case 3:
                    System.out.println("Πολλαπλασιασμός: " + mul(num1, num2));
                    break;
                case 4:
                    System.out.println("Διαίρεση: " + div(num1, num2));
                    break;
                case 5:
                    System.out.println("Υπόλοιπο: " + mod(num1, num2));
                    break;
                case 6:
                    System.out.println("Αντίο");
                    break;
                default:
                    System.out.println("Παρακαλώ δώστε έναν αριθμό μεταξύ 1 - 6");
                    break;
            }
        } while (choice !=6);

    }

    public static int add (int num1, int num2) {
        return num1 + num2;
    }

    public static int sub (int num1, int num2) {
        return num1 - num2;
    }

    public static int mul (int num1, int num2) {
        return num1 * num2;
    }

    public static int div (int num1, int num2) {
        return num1 / num2;
    }

    public static int mod (int num1, int num2) {
        return num1 % num2;
    }

    public static void showMenu () {
        System.out.println("Επιλέξτε ένα από τα παρακάτω");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμό");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Υπόλοιπο");
        System.out.println("6. Έξοδος");

    }
}