package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;


public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quante parole vuoi inserire?");
        int N = scanner.nextInt();
        scanner.nextLine();

        HashSet<String> ExclusiveWords = new HashSet<>();
        HashSet<String> DupWords = new HashSet<>();
        for (int i = 0; i < N; i++) {
            System.out.println("Inserisci la parola: ->");
            String word = scanner.nextLine();
            if (!ExclusiveWords.add(word)){
                DupWords.add(word);
            }
        }
        System.out.println("\nParole duplicate:");
        System.out.println("#"+ DupWords.size());
        if (DupWords.isEmpty()) {
            System.out.println("Nessuna parola duplicata.");
        } else {
            for (String word : DupWords) {
                System.out.println(word);
            }
        }

        System.out.println("\nParole Uniche:");
        System.out.println("#"+ ExclusiveWords.size());
        if (ExclusiveWords.isEmpty()){
            System.out.println("Nessuna parola unica");
        }else {
            for (String word : ExclusiveWords) {
                System.out.println(word);

            }
        }

    }

}
