package es1;

import java.util.Scanner;

public class Es1_1 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("inserisci il numero");
        String num= scanner.nextLine();
        System.out.println(annoBisestile(Integer.parseInt(num)));

    }
    public static boolean annoBisestile(int num){

        if (num % 400 == 0) {
            return true;
        } else if (num % 100==0) {
             return false;
        } else if (num % 4==0) {
             return true;
        } else return false;

    }
}
