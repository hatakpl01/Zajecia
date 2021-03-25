package lekcja6;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int kubekStary = 9;
        int kubekPies = 8;

//        porownywaczka(kubekStary, kubekPies);
//        Math.pow(2, 2);
//        porownywaczka2(kubekStary, kubekPies);

        wypisywaczka("lubie placki", "i koty");

        String kubek1 = "lubie placki";
        String kubek2 = "i koty";
        wypisywaczka(kubek1, kubek2);
        poleKwadratu(5);
    }

    private static void poleKwadratu(int bok) {
        System.out.println(bok * bok);
    }

    public static void wypisywaczka(String tekst, String tekst2) {
        System.out.println(tekst + " " + tekst2);
    }

    public static void porownywaczka2(int garnek, int patelnia) {
        if (garnek > patelnia) {
            System.out.println(garnek);
        } else {
            System.out.println(patelnia);
        }
    }

    public static void porownywaczka(int garnek, int patelnia) {
        if (garnek > patelnia) {
            System.out.println("W garnku było więcej");
        } else {
            System.out.println("W garnku było mniej albo tyle samo");
        }
    }

//    1. Zauważmy, że mamy tutaj powtarzający się kod.
//      Warto byłoby go zamknąć w jakimś małym kawałku
//      Tymi kawałkami są metody.

//    2. Co to jest metoda?
//      Jest to wyodrębniony kawałek kodu który wykonyje jakąś funkcjonalność
//    Pokazówka - które większe?
//    Pokazówka - suma

//    3. Wyciągnięcie z naszego kodu powyżej powtarzających się elementów
//    4. Napisanie tego co było na pokazówkach
//          Jak wygląda wywołanie metody?

//    5. Napisz metodę przyjmującą dwa argumenty typu String i je wypisujące
//    6. Napisz metodę liczącą i wypisującą pole kwadratu
//    7. Napisz metodę liczącą i wypisującą pole trójkąta

//    8. Czasami chcemy żeby nasza metoda coś przyjęła dokonała obliczeń i to zwróciła
//      Słowo return w metodzie
//      Pokazówka jak starczy czasu

}
