package PrzykladEnum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj moc: ");
        String mocString = scanner.nextLine();
        int moc = Integer.parseInt(mocString);

        System.out.println("Podaj marke: ");
        String marka = scanner.nextLine();


        TypProcesora typ = null;

        do {
            try {
                System.out.println("Podaj typ procesora: ");
                String typString = scanner.nextLine();
                typ = TypProcesora.valueOf(typString.trim().toUpperCase());
            } catch (IllegalArgumentException dowolnaNazwa) {
                System.err.println("Nie wpisales poprawnego typu procesora, sprobuj ponownie:");

            }
        } while (typ == null) ;


            Komputer komputer = new Komputer(moc, marka, typ);

            System.out.println(komputer);


    }
}
