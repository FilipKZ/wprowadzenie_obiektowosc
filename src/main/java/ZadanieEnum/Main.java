package ZadanieEnum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj imie");
        String imie = input.nextLine();
        System.out.println("Podaj nazwisko");
        String nazwisko = input.nextLine();
        System.out.println("Podaj PESEL");
        long pesel = Long.parseLong(input.nextLine());

        Plec plec = null;
        do {
            System.out.println("Podaj plec");
            String plecString = input.nextLine();
            try {
                plec = Plec.valueOf(plecString);
            } catch (IllegalArgumentException iae) {
                System.err.println("Blad");
            }
        }while (plec == null) ;

        Obywatel obywatel = new Obywatel(imie, nazwisko, pesel, plec);

        System.out.println(obywatel);
    }
}
