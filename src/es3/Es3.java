package es3;

import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci una stringa");
        String str = scanner.nextLine();
        System.out.println(whileProgram(String.valueOf(Integer.parseInt(str))));
    }

    public static String whileProgram(String str) {
        while (str != ":q") {
            str.split(",");
        }

        return str.join(str, "");
    }

}
