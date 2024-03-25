package gr.aueb.cf.ch5;

public class test {

    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            System.out.println("*");
            for (int j = 1; j <= i; j++) {
                System.out.println("*");
            }
        }

    }
}
