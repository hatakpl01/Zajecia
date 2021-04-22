package lekcja7;

public class Zadanie {

    //    0. Napisać metodę przyjmującą tablicę liczb naturalnych i zwracającą ich sumę.
    //    1. Napisz metodę przyjmującą tablicę liczb naturalnych i zwracającą najmniejszą z nich
    //    2. Napisz metodę przyjmującą tablicę liczb naturalnych i zwracającą największą z nich
    //    3*. Napisz metodę przyjmującą tablicę liczb naturalnych i zwracającą tablicę liczb naturalnych utworzoną przez
    //      posortowanie malejąco wejściowej tablicy
    //    4*. Napisz metodę przyjmującą tablicę liczb naturalnych i zwracającą tablicę liczb naturalnych utworzoną przez
    //      posortowanie rosnąco wejściowej tablicy

    public static void main(String[] args) {


        //    0. Napisać metodę przyjmującą tablicę liczb naturalnych i zwracającą ich sumę.

        int liczbyNaturalne[] = {0, 2, 4, 6, 9, 11};

        System.out.println("Suma wynosi: " + SumaLiczbNaturalnych(liczbyNaturalne));


        System.out.println("***************************************");

        //    1. Napisz metodę przyjmującą tablicę liczb naturalnych i zwracającą najmniejszą z nich

        int[] tablica = {5, 12, 7, 16, 6, 2, 84, 2};

        System.out.println("Najmniejszy element tablicy wynosi: " + NajmniejszaLiczbaNaturalna(tablica));

        System.out.println("***************************************");

        // 2. Napisz metodę przyjmującą tablicę liczb naturalnych i zwracającą największą z nich
        System.out.println("Najwiekszym elementem tablicy jest: " + NajwiekszyElementTablicy(tablica));

        System.out.println("***************************************");

        // Napisz metodę przyjmującą tablicę liczb naturalnych i zwracającą tablicę liczb naturalnych utworzoną przez
        //      posortowanie malejąco wejściowej tablicy


    }

    public static int SumaLiczbNaturalnych(int[] tablica)
    {
        int suma = 0;

        for(int liczba : tablica)
        {
            suma += liczba;
        }
        return suma;
    }

    public static int NajmniejszaLiczbaNaturalna(int[] tablica)
    {
        int najmniejszyElement = tablica[0];

        for (int i = 0; i < tablica.length; i++)
        {
            if (tablica[i] < najmniejszyElement)
            {
                najmniejszyElement = tablica[i];
            }
        }

        return najmniejszyElement;
    }

    public static int NajwiekszyElementTablicy(int[] tablica)
    {
        int najwiekszyElementTablicy = tablica[0];

        for (int liczba : tablica)
        {
            if (najwiekszyElementTablicy < liczba)
            {
                najwiekszyElementTablicy = liczba;
            }
        }

        return najwiekszyElementTablicy;
    }

    public static int[] SortowanieTablicyMalejaco(int[] tablica)
    {
        int tablicaPosortowana[];

        for (int liczba : tablica)
        {
            if ()
            {

            }
            else
            {

            }
        }


        return tablicaPosortowana;
    }




}
