package gr.aueb.cf.ch5;

import java.util.Scanner;

/*
* Ορίζει μεθόδους που ελέγχουν αν ένας αριθός
* είναι άρτιος ή περιττός
*
* @author fotisPag
*
* */


public class EvenOrOdd {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Δώσε ένα ακέραιο αριθμό");
        num = in.nextInt();
        if (isEven(num)) {
            System.out.println("Ο αριθμός " + num + "είναι άρτιος");
        }
        if (isOdd(num)) {
            System.out.println("Ο αριθμός " + num + "είναι περιττός");
        }

        /*
        * Ελέγχει αν ένας αριθμός είναι άρτιος
        * @param a ο αριθμός που ελέγχουμε
        * @return true, αν ο αριθμός είναι άρτιος, αλλιώς false
        * */
        public static boolean isEven(int a) {
            return ((a % 2) == 0);
        }
        /*
         * Ελέγχει αν ένας αριθμός είναι περιττός
         * @param a ο αριθμός που ελέγχουμε
         * @return true, αν ο αριθμός είναι περιττός, αλλιώς false
         * */
        public static boolean isOdd(int a) {
            return ((a % 2) != 0);
        }
    }

}
