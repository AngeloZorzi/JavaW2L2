package Esercizio2;

import java.util.*;

public class Print {
    public static void printPos(List<Integer> lista, boolean pari) {
        System.out.println(pari ? "Valori in posizioni pari:" : "Valori in posizioni dispari:");
        for (int i = 0; i < lista.size(); i++) {
            if ((i % 2 == 0) == pari) {
                System.out.println("Indice " + i + ": " + lista.get(i));
            }
        }
    }
}
