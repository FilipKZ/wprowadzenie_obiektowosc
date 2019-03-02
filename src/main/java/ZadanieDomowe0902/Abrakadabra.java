package ZadanieDomowe0902;

import java.util.Scanner;

public class Abrakadabra {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        String tekst = wejscie.nextLine();
        String[] znaki = tekst.split("");
        String ostatniZnak = znaki[tekst.length() - 1];
        int liczbaZnakow = 0;

        for (int i = 0; i < tekst.length(); i++) {
            if (znaki[i].equals(ostatniZnak)) {
                liczbaZnakow += 1;
            }
        }
        System.out.println(liczbaZnakow);
    }
}
