import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void output(List<String> lista){
        for (String item: lista) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */

        Scanner sc = new Scanner(System.in);
        List<String> lista1 = new ArrayList<>();
        lista1.add("krowa");
        lista1.add("gekon");
        lista1.add("kot");
        lista1.add("pies");
        lista1.add("rekin");

//        opcja z inputem od uzytkownika
//        for (int i = 0; i < 5; i++) {
//            String animal = sc.nextLine();
//            lista1.add(animal);
//        }

        output(lista1);

        int size = lista1.size();
        lista1.remove(size-1);
        lista1.remove(size-2);

        System.out.println();
        output(lista1);

        System.out.println();
        lista1.add("kon");
        lista1.add("malpa");
        lista1.add("slon");

        output(lista1);
        System.out.println("wielkosc listy: " + lista1.size());
        System.out.println();

        List<String> lista2 = new ArrayList<>();

        // sortowanie bez uzywacia Collections.sort(lista1);
        int index = lista1.size()-1;
        for (int i = 0; i < lista1.size(); i++){
            lista2.add(lista1.get(index));
            index--;
        }

        output(lista2);



         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */

        Set<Integer> lista3 = new TreeSet<>(); // treeset jest juz posortowany

        lista3.add(5);
        lista3.add(2);
        lista3.add(5);
        lista3.add(8);
        lista3.add(1);
        lista3.add(34);
        lista3.add(7);
        lista3.add(2);
        lista3.add(8);
        lista3.add(15);

        System.out.println();
        System.out.println(lista3);
        System.out.println();

        for (Integer x: lista3) {
            System.out.println(x);
        }

    }

}
