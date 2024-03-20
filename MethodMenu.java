package gr.aueb.cf.ch5;

/*
* Εμφανίζει ένα μενού επιλογών και δίνει τη δυνατότητα στο χρήστη να το επιλέξει
*
* @author fotisPag
* */

import java.util.Scanner;

public class MethodMenu {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int choice;

        do {

            showMenu();
            choice = in.nextInt();

            switch (choice){

                case 1:
                    System.out.println("Η εισαγωγή έγινε επιτυχώς");
                    break;
                case 2:
                    System.out.println("Η ενημέρωση έγινε επιτυχώς");
                    break;
                case 3:
                    System.out.println("Η διαγραφή έγινε επιτυχώς");
                    break;
                case 4:
                    System.out.println("Η αναζήτηση έγινε επιτυχώς");
                    break;
                case 5:
                    System.out.println("Αντίο");
                    break;
                default:
                    System.out.println("Παρακαλώ δώστε μια επιλογή 1 - 5");
                    break;
            }

        } while (choice != 5);


    }

    public static void showMenu(){
        System.out.println("Επιλέξτε:");
        System.out.println("1. Για εισαγωγή");
        System.out.println("2. Για ενημέρωση");
        System.out.println("3. Για διαγραφή");
        System.out.println("4. Για αναζήτηση");
        System.out.println("5. Για έξοδο");

    }

}
