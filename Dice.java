package gr.aueb.cf.ch5;

/*
* Εμφανίζει τυχαίες τιμές δύο ζαριών
* στο διάστημα 1-6
*
* @author fotisPag
* */

public class Dice {

    public static void main(String[] args) {
        int dice1, dice2;

        //Η Math.random() επιστρέφει μια τιμή double
        // έστω r, στο διάστημα 1.0 <= r < 7.0
        for (int i = 1; i <= 5; i++){
            dice1 = (int) (Math.random() * 6 + 1);
            dice2 = (int) (Math.random() * 6 + 1);
            System.out.println(dice1 + "," + dice2);
        }
    }
}