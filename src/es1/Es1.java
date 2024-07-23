package es1;

import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci la stringa");
        String str = scanner.nextLine();
        System.out.println(stringaPariDispari(str));

    }

    public static boolean stringaPariDispari(String str) {

        if (str.length() % 2 == 0) return true;
        else return false;


    }
}
