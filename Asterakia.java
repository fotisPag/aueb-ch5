//package gr.aueb.cf.ch5;
//
//import java.util.Scanner;
//
///*
//* Δημιουργήστε μία εφαρμογή που να εμφανίζει
//ένα μενού με 6 επιλογές:
//1. Εμφάνισε n αστεράκια οριζόντια
//2. Εμφάνισε n αστεράκια κάθετα
//3. Εμφάνισε n γραμμές με n αστεράκια
//4. Εμφάνισε n γραμμές με αστεράκια 1 – n
//5. Εμφάνισε n γραμμές με αστεράκια n – 1
//6. Έξοδος από το πρόγραμμα
//Δώσε επιλογή:
//• Και μετά: Δώστε αριθμό για αστεράκια
//Αθ. Ανδρούτσος
//61
//Προγραμματισμός με Java
//Μικρή εργασία (2)
//• Κάθε μία από τις πέντε πρώτες επιλογές θα
//πρέπει να υλοποιηθεί με μέθοδο.
//• Ο χρήστης θα δίνει ένα αριθμό για
//αστεράκια
//• Οι επιλογές 3, 4, και 5 θα πρέπει να
//υλοποιηθούν με τη βοήθεια της μεθόδου της
//επιλογής 1
//• Το πρόγραμμα θα πρέπει να τρέχει μέχρι ο
//χρήστης να επιλέξει την Επιλογή 6
//*
//*
//* */
//
//public class Asterakia {
//
//    public static void main (String[] args) {
//        Scanner in = new Scanner (System.in);
//        int choice, asteria = 1;
//
//
//        do {
//            menu();
//            choice = in.nextInt();
//
//
//            if (choice != 6){
//                System.out.println("Δώσε αριθμό για αστεράκια");
//                asteria = in.nextInt();
//            }
//
//
//
//
//        } while ( choice != 6);
//    }
//
//    public static void menu() {
//        System.out.println("1.Εμφάνισε n αστεράκια οριζόντια");
//        System.out.println("2.Εμφάνισε n αστεράκια κάθετα");
//        System.out.println("3.Εμφάνισε n γραμμές με n asterakia");
//        System.out.println("4.Εμφάνισε n γραμμές με αστεράκια 1 - n");
//        System.out.println("5.Εμφάνισε n γραμμές με αστεράκια n - 1");
//        System.out.println("6.Έξοδος από το πρόγραμμα");
//        System.out.println("Δώσε επιλογή:");
//    }
//
//    public static int epilogi() {
//        switch (choice) {
//            case 1:
//                prwti();
//                break;
//            case 2:
//                deuteri();
//                break;
//            case 3:
//                triti();
//                break;
//            case 4:
//                tetarti();
//                break;
//            case 5:
//                pempti();
//                break;
//            case 6:
//                System.out.print("Αντίο");
//                break;
//            default:
//                System.out.println("Παρακαλώ δώστε έναν αριθμό μεταξύ 1 - 6");
//                break;
//        }
//    }
//
//    public static void prwti(int a) {
//        for (int i =1; i<=a; i++){
//            System.out.print("*");
//        }
//    }
//    public static void deuteri(int a) {
//        for (int i =1; i<=a; i++){
//            System.out.println("*");
//        }
//    }
//    public static void prwti(int a) {
//        for (int i =1; i<=a; i++){
//            System.out.print("*");
//                for (int i =1; i<=a; i++){
//                    System.out.print("*");
//            }
//        }
//    }
//
//
//
//
//}
