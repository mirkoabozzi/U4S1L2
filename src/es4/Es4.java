package es4;

import java.util.Scanner;

public class Es4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci il numero");
        String num = scanner.nextLine();
        System.out.println(countDown(Integer.parseInt(num)));
    }

    public static int countDown(int num) {
        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
        return num;
    }
}
