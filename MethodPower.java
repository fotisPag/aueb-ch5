package gr.aueb.cf.ch5;

import java.util.Scanner;

/*
* Ορίζει μια μέθοδο που υπολογίζει το a^n
* Ελέγχει με την main() την ορθή λειτουργία
* της μεθόδου
*
* @autor fotisPag
* */



public class MethodPower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int power, a, n;

        System.out.println("Δώστε δύο ακεραίους");
        a = in.nextInt();
        n = in.nextInt();

        power = pow(a, n);

        System.out.printf("Η δύναμη του %d εις την %d είναι: %d",
                            a, n, power);

    }


    /*
    * Υπολογίζει το a^n
    *
    * @parama a η βάση
    * @param n η δύναμη
    * @return η δύναμη του a^n
    *
    * */

    public static int pow(int a, int n){
        int power = 1;

        for (int i = 1; i<= n; i++){
            power = power * a;
        }
        return power;
    }

}
