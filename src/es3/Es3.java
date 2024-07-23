package es3;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("inserisci una stringa");
            String str = scanner.nextLine();
            if (Objects.equals(str, ":q")) break;
            char[] arrayCaratteri = str.toCharArray();
            System.out.println(Arrays.toString(arrayCaratteri));

        }

    }

}
