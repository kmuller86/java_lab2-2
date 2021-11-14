import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");
        int i = sc.nextInt();

        switch (i % 2) {
            case 0:
                System.out.println("Parzysta");
                break;
            default:
                System.out.println("Nieparzysta");
                break;
        }

        System.out.println("Podaj liczbe: ");
        int j = sc.nextInt();

        switch (j % 7) {
            case 0:
                System.out.println("Podzielna");
                break;
            default:
                System.out.println("Niepodzielna");
                break;
        }

        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */

        String str = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        char[] actualCharArray = str.toCharArray();

        int o = 0;
        int p = 0;
        int x = 0;
        int z = 0;
        int q = 0;
        int def = 0;

        for (char item: actualCharArray) {
            switch (item) {
                case 'o':
                    o++;
                    break;
                case 'p':
                    p++;
                    break;
                case 'x':
                    x++;
                    break;
                case 'z':
                    z++;
                    break;
                case 'q':
                    q++;
                    break;
                default:
                    def++;
                    break;
            }
        }

                System.out.println("Liczba liter 'o' w wyrazie: " + o);
                System.out.println("Liczba liter 'p' w wyrazie: " + p);
                System.out.println("Liczba liter 'x' w wyrazie: " + x);
                System.out.println("Liczba liter 'z' w wyrazie: " + z);
                System.out.println("Liczba liter 'q' w wyrazie: " + q);
                System.out.println("Reszta: " + def);
        }
    }
