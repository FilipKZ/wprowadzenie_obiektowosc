package ZadanieDomowe0902;

import java.util.Scanner;

public class OdwroconyTekst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź tekst:");
        String liniaTekstu = scanner.nextLine()
                .trim();

        // sposób 1:
        String tekst = "";
        for (int i = liniaTekstu.length() - 1; i >= 0; i--) {
            tekst += liniaTekstu.charAt(i);
        }
        System.out.println(tekst);

        // sposób 2:
        StringBuilder builder = new StringBuilder(liniaTekstu);
        System.out.println(builder.reverse().toString());
    }

}
