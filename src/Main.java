import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void wypelniacz(int[] tab) {
        int max = 40;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = max;
            max--;
        }
    }

    public static void wypisuje(int[] tab) {
        for (int item: tab) {
            System.out.println(item);
        }
    }

    public static void wypisuje2(String[] tab) {
        int x = tab.length-1;
        while (x > -1){
            System.out.println(tab[x]);
            x--;
        }
    }

    public static void wypleniaczString(String[] tab){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            String input = sc.nextLine();
            tab[i] = input;
        }
    }

    public static void name(String imie){
        System.out.println(imie);
    }

    public static void name(String imie, String nazwisko){
        System.out.println(imie + " " + nazwisko);
    }

    public static void name(String imie, String nazwisko, int wiek){
        System.out.println(imie + " " + nazwisko + ", wiek: " + wiek);
    }

    public static int liczba(int pierwsza, int druga){
        int suma = pierwsza+druga;
        return suma;
    }

    public static int liczba(int pierwsza, int druga, int trzecia){
        int suma = pierwsza+druga+trzecia;
        return suma;
    }

    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */

        int[] table = new int[20];
        wypelniacz(table);
        wypisuje(table);

        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */

        String[] table2 = new String[6];
        wypleniaczString(table2);
        wypisuje2(table2);


        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

        String imie = "Tomek";
        String nazwisko = "xxx";
        int wiek = 27;

        name(imie);
        name(imie, nazwisko);
        name(imie, nazwisko, wiek);


        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */

        int liczba = liczba(3,5);
        System.out.println(liczba);
        int liczba2 = liczba(3,2,5);
        System.out.println(liczba2);

        System.out.println(liczba(3,2) + liczba(5,5,5));

    }

}
