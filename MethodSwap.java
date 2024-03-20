package gr.aueb.cf.ch5;

/*
* Swap demo που δείχνει τη swap καθώς και τη
* μεταβίβαση παραμέτρων κατά τιμή (by value)
*
* @autor fotisPag
* */

public class MethodSwap {

    public static void main(String[] args) {
        int x = 15, y = 1;

        swap(x, y);

        System.out.printf("x=%d, y=%d", x, y);

    }

    /*
    * Ανταλλάσσει αμοιβαία τις τιμές των χ, y
    *
    * @param x η 1η τιμή
    * @param y η 2η τιμή
    *
    * */

    public static void swap (int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }



}
