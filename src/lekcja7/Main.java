package lekcja7;

public class Main {

    public static void main(String[] args) {
//        1. Metody mogą zwracać wartości
//          - Przeróbmy z naszego poprzedniego zadania poleKwadratu(), tak aby zwracało wartość pola kwadratu
//          - Przeróbmy porownywaczka(), tak aby zwracało większą liczbę
//          - Napisz metodę liczącą i zwracającą pole trójkąta (przyjmuje a i h)
//          -* Dla ambitnych: napisz metodę sprawdzającą, czy dana liczba należy do ciągu Fibonacciego


        System.out.println(poleKwadratu(5));
        System.out.println(porownywaczka(10, 5));

//        2. Tablice
//          Potrzebujemy przechowywać sobie 5 liczb - 5 zmiennych, 100 liczb - 100 zmiennych. No trochę niewygodne.
//
        int[] liczby = {1, 2, 3 , 4, 5, 6, 7 , 8, 9, 10};
        String[] imiona = {"Antonia", "Maria", "Przemek", "Dominika"};

//        Jak dostać się do pojedynczego elementu?
        int liczba1 = liczby[0];
        int liczba2 = liczby[1];

        System.out.println(liczba1);
        System.out.println(liczba2);

        String imie1 = imiona[0];
        String imie2 = imiona[1];

        System.out.println(imie1);
        System.out.println(imie2);
        System.out.println("-=============================-");
//        Jak wypisać wszystko co jest w danej tablicy?
        for (String s : imiona) {
            System.out.println(s);
        }

        imiona[0] = "Staszek";
        System.out.println("-=============================-");

        wypisywaczka(imiona);
//        forEach


        int[] liczby2 = {5,6,1,2,90};
        System.out.println(znajdzNajmniejsza(liczby2));
    }

    private static int poleKwadratu(int bok) {
        return bok * bok;
    }

    public static int porownywaczka(int garnek, int patelnia) {
        if (garnek > patelnia) {
            return garnek;
        } else {
            return patelnia;
        }
    }

    public static void wypisywaczka(String[] tablica) {
        for (String slowo : tablica) {
            System.out.println(slowo);
        }
    }

    public static int znajdzNajmniejsza(int[] tablica) {
        int najmniejsza = tablica[0];

        for (int liczba : tablica) {
            if (liczba < najmniejsza) {
                najmniejsza = liczba;
            }
        }
        return najmniejsza;
    }

}
