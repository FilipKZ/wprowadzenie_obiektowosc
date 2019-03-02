package ZadanieDomowe0902;

import java.util.Scanner;

public class ZliczanieSlow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź tekst:");
        String liniaTekstu = scanner.nextLine()
                .trim()
                .toLowerCase()
                .replaceAll(",", "")
                .replaceAll("[.]", "");

        String[] slowa = liniaTekstu.split(" ");

        for (int i = 0; i < slowa.length; i++) {
            String aktualneSlowo = slowa[i];
            int licznikWystapien = 0;
            boolean slowoJuzWystapilo = false;

            for (int j = 0; j < slowa.length; j++) {
                if (aktualneSlowo.equals(slowa[j])) {
                    if (i > j) {
                        slowoJuzWystapilo = true;
                        break;
                    }
                    licznikWystapien++;
                }
            }
            if (!slowoJuzWystapilo) {
                // po obiegu wewnętrznej pętli licznikWystapien zawiera ilosc
                // wystapien slowa 'aktualneSlowo'
                System.out.println(aktualneSlowo + "- " + licznikWystapien);
            }
        }

    }

}
