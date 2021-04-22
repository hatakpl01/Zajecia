package lekcja6;

import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
//        1. Napisz metodę liczącą pole trapezu
//        2. Napisz metodę wypisującą Twoje imie zadaną w parametrze ilość razy
//        3. Napisz metodę sprawdzającą czy w przekazanym do niej tekście jest literka "e"
//        4. Napisz metodę sprawdzającą czy przekazany do niej tekst jest pusty

        // Napisz metodę liczącą pole trapezu
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj długość pierwszej podstawy: ");
        double podstawaA = scanner.nextDouble();

        System.out.print("Podaj długość drugiej podstawy: ");
        double podstawaB = scanner.nextDouble();

        System.out.print("Podaj wysokość trapezu: ");
        double wysokosc = scanner.nextDouble();

        System.out.println("");
        System.out.println("Pole trapezu wynosi: " + poleTrapezu (podstawaA, podstawaB, wysokosc));

        System.out.println("****************************************");

        // Napisz metodę wypisującą Twoje imie zadaną w parametrze ilość razy
        System.out.print("Ile razy wypisać imię: ");

        Scanner ileRazy = new Scanner(System.in);
        int ile = ileRazy.nextInt();

        wypiszImie(ile, "Wiesiek");

        System.out.println("****************************************");

        // Napisz metodę sprawdzającą czy w przekazanym do niej tekście jest literka "e"
        System.out.print("Podaj tekst do sprawdzenia: ");

        Scanner tekst = new Scanner(System.in);
        String tekstSprawdzany = tekst.nextLine();

        sprawdzTest(tekstSprawdzany);

        System.out.println("****************************************");

        // Napisz metodę sprawdzającą czy przekazany do niej tekst jest pusty

        System.out.print("Wprowadź tekst: ");
        Scanner tekstDoSprawdzenia = new Scanner(System.in);
        String sprawdz = tekstDoSprawdzenia.nextLine();

        sprawdzCzyPusty(sprawdz);

        System.out.println("****************************************");

    }

    // Pole trapezu
    public static double poleTrapezu(double podstawaA, double podstawaB, double wysokosc)
    {
        double pole;
        return pole = ((podstawaA + podstawaB) / 2) * wysokosc;
    }

    public static void wypiszImie(int ile, String imie)
    {
        for (int i = 0; i < ile; i++)
        {
            System.out.println("imie");
        }
    }

    public static void sprawdzCzyPusty(String tekst)
    {
        String odpowiedz;

        if (tekst.length() == 0)
        {
            System.out.println("Przekazany tekst jest pusty");
        }
        else
        {
            System.out.println("Przekazany tekst nie jest pusty");
        }
    }

    public static void sprawdzTest(String tekstSprawdzany)
    {
        String findChar = "e";

        boolean wynik = tekstSprawdzany.indexOf(findChar) != -1 ? true : false;

        if (wynik)
        {
            System.out.println("W podanym tekście znajduje się litera " + findChar);
        }
        else
        {
            System.out.println("W podanym tekscie nie ma litery " + findChar);
        }
    }
}
