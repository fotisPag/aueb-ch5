package gr.aueb.cf.ch5;

import java.util.Scanner;

/*
* Υπολογίζει το άθροισμα δύο ακεραίων αριθμών
* με τη χρήση μεθόδου
*
* @author fotisPag
* */


public class MethodAdd {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int first, second;
        int sum2;

        do {
            System.out.println("Δώσε πρώτο αριθμό");
            first = in.nextInt();
            
            System.out.println("Δώσε δεύτερο αριθμό");
            second = in.nextInt();

            //sum2 = add(first, second);
            sum2 = MethodAdd.add(first, second);
            System.out.println("Το άθροισμα είναι " + sum2);
        } while(sum2 !=0);
        System.out.println("Αντίο");
    }

    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }

}
