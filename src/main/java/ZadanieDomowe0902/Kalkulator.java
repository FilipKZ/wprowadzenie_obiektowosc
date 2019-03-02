package ZadanieDomowe0902;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        int liczba1 = Integer.parseInt(input.nextLine());
        System.out.println("Podaj znak działania: ");
        String dzialanie = input.nextLine();
        System.out.println("Podaj druga liczbe: ");
        int liczba2 = Integer.parseInt(input.nextLine());

        if (dzialanie.equals("+")) {
            System.out.println(liczba1 + liczba2);
        } else if (dzialanie.equals("-")) {
            System.out.println(liczba1 - liczba2);
        } else if (dzialanie.equals("*")) {
            System.out.println(liczba1 * liczba2);
        } else if (dzialanie.equals("/")) {
            if (liczba2 != 0) {
                System.out.println(liczba1 / liczba2);
            } else {
                System.out.println("Dzielenie przez 0!");
            }

        } else {
            System.out.println("Nieprawidlowe dzialanie");
        }
    }
}