package gr.aueb.cf.ch5;

import java.util.Scanner;

/*
* Ορίζει μία μέθοδο που υπολογίζει το n1!
* και μία main() που ελέγχει τη λειτουργία της μεθόδου
*
* @author fotisPag
* */
public class MethodFactorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int facto, n;

        System.out.println("Δώστε ένα ακέραιο");
        n = in.nextInt();
        facto = factorial(n);

        System.out.println("Το παραγοντικό του " + n + " είναι: " + facto);

    }

    public static int factorial (int n){
        //Δήλωση και αρχικοποίηση
        int facto = 1;

        //for
        for(int i=1; i<=n; i++) {
            facto = facto * i;
        }
        //επιστροφή τιμής
        return facto;
    }

}
