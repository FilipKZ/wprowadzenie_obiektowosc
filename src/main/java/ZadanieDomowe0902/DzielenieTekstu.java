package ZadanieDomowe0902;

import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

public class DzielenieTekstu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Napisz jakiś tekst");
        String text = input.nextLine();

        String[] temp = text.split(" ");
        System.out.println(temp[0]);

        for (String word: temp) {

        }

    }
}
