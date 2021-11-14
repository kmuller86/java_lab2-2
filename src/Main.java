import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */

        for (int i = 100; i >= 0; i--) {
            if ((i % 5 == 0) && (i != 0)) {
                System.out.println(i + " jest podzielna przez 5");
            }
        }

        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */

        Scanner sc = new Scanner(System.in);
        int[] table = new int[5];

        int i = 0;

        while (i < 5) {
            System.out.println("Wprowadz liczbe calkowita: ");
            table[i] = sc.nextInt();
            i++;
        }

        for (int item : table) {
            System.out.println(item+11);
        }
    }
}
