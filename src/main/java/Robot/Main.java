package Robot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Robot robot = new Robot("Marian");

        String komenda;

        do {
            System.out.println("Podaj komendę:");
            komenda = scanner.nextLine().trim().toUpperCase();

            if (komenda.startsWith("RUCH")) {
                String[] slowa = komenda.split(" ");
                // slowa[0] == "RUCH"
                // slowa[1] == jaki ruch - jeden z enumów

                if (slowa.length < 2){ // jeśli użytkownik nie poda w tej samej linii ruchu
                    System.err.println("Nie podałeś typu ruchu.");
                    continue;
                }
                RuchRobota ruchRobota;
                try{
                    ruchRobota = RuchRobota.valueOf(slowa[1]);
                }catch (IllegalArgumentException iae){
                    System.err.println("Zły rodzaj ruchu.");
                    continue;
                }

                robot.poruszRobotem(ruchRobota);
            } else if (komenda.startsWith("NALADUJ")) {
                robot.naladujRobota();
            } else if (komenda.startsWith("WLACZ")) {
                robot.włączRobota();
            } else if (komenda.startsWith("WYLACZ")) {
                robot.wyłączRobota();
            }
        } while (!komenda.equalsIgnoreCase("quit"));

        System.out.println("Kończę pracę.");
    }
}

// 1. w jednej linii (trzeba ją później podzielić)
// ruch KROK_LEWA

// 2. w oddzielnych liniach
// ruch
// KROK_LEWA

