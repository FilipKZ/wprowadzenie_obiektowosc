package ZadanieDomowe0902;

import java.util.Scanner;

public class Makarena {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Napisz jakiś tekst");
        String text = input.nextLine();

        String nowyTekst = text.replace(",", "makarena");

        System.out.println(nowyTekst);

        text = text.toUpperCase();
        System.out.println(text);
        System.out.println();
        text = text.toLowerCase();
        System.out.println(text);

    }
}
