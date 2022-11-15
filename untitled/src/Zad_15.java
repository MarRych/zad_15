import java.util.Random;
import java.util.Scanner;

public class Zad_15 {
    public static void main(String[] args) {

        Random generator = new Random();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Write tab size: ");
        int n = scanner.nextInt();

        int[] tab = new int[n];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = generator.nextInt(100);
        }
        for (int number : tab) {
            System.out.print(number + " ");
        }
        int divisibleBy7 = divisible(tab);
        System.out.print("\nDivisible by 7:\n"+divisibleBy7);

    }
    static int divisible(int[] tab){
        int licznik = 1;
        for(int elem: tab){
            if(elem%7==0) {
                licznik++;
            }
        }
        return licznik;
    }

    }




