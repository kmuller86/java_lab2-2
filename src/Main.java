import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */

        for (int i = 0; i < 10; i++) {
            if ((i % 2 == 0) && (i != 0)){
                System.out.println("tylko gdy jest parzysta");
                continue;
            }
            System.out.println("tekst");
        }

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Wpisz 'koniec' aby zakonczyc dzialanie petli.");
            String test = sc.nextLine();
            if (test.equals("koniec")){
                break;
            }
            System.out.println("Sproboj ponownie.");
        }


        System.out.println("Kończy na 16");
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            if (i == 16){
                return;
            }
        }
        
    }
}
