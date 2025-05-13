package Esercizio2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di elementi da generare: ");
        int N = scanner.nextInt();

        ListGenerator generatore = new ListGenerator();
        List<Integer> lista = generatore.listGenerator(N);

        System.out.println("\nLista ordinata:");
        System.out.println(lista);

        List<Integer> duplicata = DuplicateAndInvert.dupInv(lista);
        System.out.println("\nLista duplicata e invertita:");
        System.out.println(duplicata);

        System.out.print("\nVuoi stampare posizioni pari? (true/false): ");
        boolean pari = scanner.nextBoolean();

        Print.printPos(duplicata, pari);

        scanner.close();
    }
}
