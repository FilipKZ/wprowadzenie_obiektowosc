package PrzezZero;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pierwsza liczba: ");
        int liczba1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Druga liczba: ");
        int liczba2 = Integer.parseInt((scanner.nextLine()));

        try {
            if (liczba2 == 0) {
                throw new CholeroException("Pamietaj cholero by nie dzielic przez 0");
            }
        } catch (CholeroException e) {
            System.out.println(e.getMessage());
            System.out.println("Zamykam program");
        }
    }
}