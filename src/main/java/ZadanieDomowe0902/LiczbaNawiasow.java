package ZadanieDomowe0902;

import java.util.Scanner;

public class LiczbaNawiasow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź tekst:");
        String liniaTekstu = scanner.nextLine()
                .trim();

        char[] znaki = liniaTekstu.toCharArray();

        int licznikOtwartychNawiasow = 0;
        int licznikZamknietychNawiasow = 0;

        for (int i = 0; i < znaki.length; i++) {
            if (znaki[i] == '(') {
                licznikOtwartychNawiasow++;
            }
            if (znaki[i] == ')') {
                licznikZamknietychNawiasow++;
            }
            if (licznikOtwartychNawiasow < licznikZamknietychNawiasow) {
                break;
            }
        }

        if(licznikOtwartychNawiasow == licznikZamknietychNawiasow){
            System.out.println("OK");
        }else{
            System.out.println("NIE OK");
        }
    }
}