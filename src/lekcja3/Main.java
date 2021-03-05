package lekcja3;

public class Main {
    public static void main(String[] args) {

//    1. Używanie kodu napisanego przez innych
        double pi = Math.PI;
        double innePi = Math.PI;
        System.out.println(pi);

        double potega = Math.pow(3, 2);
        System.out.println(potega);

        String imie = "Przemek";
        boolean czyMaE = imie.contains("e");
        System.out.println(czyMaE);
//        boolean czyJestE = imie.contains("e");
//        System.out.println(czyJestE);
//        System.out.println(imie.length());


//  2. Instrucja warunkowa

        boolean warunek = true;
        warunek = false;

        if (warunek) {
            System.out.println("Prawda");
        } else {
            System.out.println("Fałsz");
        }

        int liczba1 = 6;
        int liczba2 = 6;

        System.out.println(liczba1 > liczba2);
        System.out.println(liczba2 > liczba1);

        if (liczba1 > liczba2) {
            System.out.println("True");
        }
        else if (liczba1 == liczba2) {
            System.out.println("Tu nie bedziemy");
        }
        else {
            System.out.println("False");
        }

//        Stwórz 2 zmienne typu int. Do jednej wpisz 10, do drugiej 15
//        Stwórz instrukcję warunkową sprawdzającą czy 10 jest większe od 15
//        i wypisującą w tym przypadku 10 jest większe od 15,
//        a w przeciwnym razie 10 nie jest większe od 15

        String imie2 = "Przemek";
        int dlugoscImienia = imie2.length();
//          3. Napisz program, który na podstwie długości Twojego
//          imienia wypisze odpowiedni komunikat.
//        Jeśli długość imienia jest dłuższa niż 6 znaków ma wypisać
//        "Dość długie imie"
//        W przeciwnym wypadku "Dość krótkie imie"


        double a = 3;
        double b = 1;
        double c = 10;

        double delta;

        System.out.println("Równanie ma postać " + a + "*x^2 + " + b + "*x + " + c);

        delta = Math.pow(b, 2) - 4 * a * c;








//        ======================== NIE BYLO ========================
//          4. Konwersja typów numerycznych

//        int liczbaInt = 5;
//        double liczbaDouble = liczbaInt;
//
//        System.out.println(liczbaInt);
//        System.out.println(liczbaDouble);


//          5. Rzutowanie (konwersja stratna)

//        liczbaDouble = 3.999;
//        liczbaInt = liczbaDouble;
//
//        liczbaInt = (int) liczbaDouble;
//        System.out.println(liczbaInt);
//
//        liczbaInt = 300;
//        byte liczbaByte = (byte) liczbaInt;
//
//        System.out.println(liczbaByte);


//          6. Operatory z przypisaniem

//        int x = 0;
//
//        x = x + 5;
//        System.out.println(x);
//
//        x += 5;
//        System.out.println(x);
//
//        x *= 2;
//        System.out.println(x);


//          7. Operatory inkrementacji i dekrementacji
//
//        int i = 0;
//
//        // postinkrementacji
//        i++;
//        System.out.println(i);
//
//        // postdekrementacji
//        i--;
//        System.out.println(i);
//
//        // preinkrementacji
//        ++i;
//        System.out.println(i);
//
//        // postdekrementacji
//        --i;
//        System.out.println(i);
//
//        int m = 7;
//        int n = 7;
//
//        int a = 2 * ++m;
//        int b = 2 * n++;
//
//        System.out.println("m = " + m);
//        System.out.println("n = " + n);
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);


//          8. Operatory relacyjne i logiczne

//        System.out.println( "3 == 7 " + (3 == 7));
//        System.out.println( "3 != 7 " + (3 != 7));
//        System.out.println( "3 > 7 " + (3 > 7));
//        System.out.println( "3 >= 7 " + (3 >= 7));
//        System.out.println( "3 <= 7 " + (3 <= 7));
//        System.out.println("!true " + (!true));
//
//        System.out.println("true || false " + (true || false));
//        System.out.println("true && false " + (true && false));

    }

}
