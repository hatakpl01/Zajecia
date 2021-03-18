package lekcja5;

public class Main {

    public static void main(String[] args) {
//    1. Instrukcje przerywające przepływ sterowania
//    break;
//    continue;

        int i = 0;

        while (i < 10) {
            i++;
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i = " + i);
        }

        System.out.println("=========================");

        int j = 0;
        while (j < 10) {
            if (j == 7) break;
            j++;
            System.out.println("j = " + j);
        }

//        2. Robimy wspólnie zadanie domowe
//        3. W zadaniu domowym zmodyfikować kod tak, żeby wyświetlana była liczba prób. Ich całkowita ilość to 10.
//              Ma się pojawiać 1/10, 2/10, 3/10 ...
//        4. Zamiast wyliczenia 1/10... ma się drugować ładny pasek postępu [XX--------] gdzie "X" oznaczają użyte próby
//              a " - " jeszcze dostępne
    }
}
