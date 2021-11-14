public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
        System.out.println("Zadanie nr1");
        int i = 1000;

        do {
            i--;
            System.out.println(i);
            if ((i % 4 == 0)  && (i % 5 == 0) && i != 0) {
                System.out.println(i + " jest podzielne przez 4 i 5.");
            }
        } while (i != 0);

        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
        System.out.println("Zadanie nr2");
        int[] table = {5,8,13,2,1};
        double[] table2 = {13.2, 15.3, 31, 22.1, 1.1};
        String[] table3 = {"Adam", "Robert", "Tomek", "Rysiek", "Piotrek"};

        int j = 0;
        while (j < table.length) {
            System.out.println(table[j]);
            j++;
        }
        System.out.println("-----------------------------");

        j = 0;
        while (j < table2.length) {
            System.out.println(table2[j]);
            j++;
        }

        System.out.println("-----------------------------");

        j = table3.length;
        while (j > 0) {
            System.out.println(table3[j-1]);
            j--;
        }

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */
        /*
        while (true) {  // pętla cały czas będzie się powtarzać, bo warunek jest spełniony. Zmiana na false spowoduje błąd (unreachable statement)
            System.out.println("test");
        }
        */

    }
}
