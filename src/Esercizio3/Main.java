package Esercizio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();
        Scanner scanner = new Scanner(System.in);

        int scelta;

        do {
            System.out.println("\n--- Menu Rubrica ---");
            System.out.println("1. Aggiungi contatto");
            System.out.println("2. Rimuovi contatto");
            System.out.println("3. Cerca nome per numero");
            System.out.println("4. Cerca numero per nome");
            System.out.println("5. Stampa tutti i contatti");
            System.out.println("0. Esci");
            System.out.print("Scegli un'opzione: ");

            scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Inserisci numero: ");
                    String numero = scanner.nextLine();
                    rubrica.aggiungiContatto(nome, numero);
                    break;

                case 2:
                    System.out.print("Inserisci nome da rimuovere: ");
                    String nomeDaRimuovere = scanner.nextLine();
                    rubrica.rimuoviContatto(nomeDaRimuovere);
                    break;

                case 3:
                    System.out.print("Inserisci numero da cercare: ");
                    String numeroCercato = scanner.nextLine();
                    String nomeTrovato = rubrica.cercaNomePerNumero(numeroCercato);
                    if (nomeTrovato != null) {
                        System.out.println("Il numero appartiene a: " + nomeTrovato);
                    } else {
                        System.out.println("Numero non trovato.");
                    }
                    break;

                case 4:
                    System.out.print("Inserisci nome da cercare: ");
                    String nomeCercato = scanner.nextLine();
                    String numeroTrovato = rubrica.cercaNumeroPerNome(nomeCercato);
                    if (numeroTrovato != null) {
                        System.out.println("Il numero di " + nomeCercato + " è: " + numeroTrovato);
                    } else {
                        System.out.println("Contatto non trovato.");
                    }
                    break;

                case 5:
                    rubrica.stampaContatti();
                    break;

                case 0:
                    System.out.println("Uscita dal programma.");
                    break;

                default:
                    System.out.println("Opzione non valida.");
            }

        } while (scelta != 0);

        scanner.close();
    }
}
