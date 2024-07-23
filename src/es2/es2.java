package es2;

import java.util.Scanner;

public class es2 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("inserisci il numero");
        String num= scanner.nextLine();
        System.out.println(programmSwitch(Integer.parseInt(num)));

    }
    public static String programmSwitch(int num){
        return switch (num) {
            case 0 -> "zero";
            case 1 -> "uno";
            case 2 -> "due";
            case 3 -> "tre";
            default -> "inserisci un numero compreso tra 0 e 3";
        };
    }
}
