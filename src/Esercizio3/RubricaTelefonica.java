package Esercizio3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    private Map<String, String> contatti;

    public RubricaTelefonica() {
        contatti = new HashMap<>();
    }

    public void aggiungiContatto(String nome, String numero) {
        contatti.put(nome, numero);
        System.out.println("Contatto aggiunto: " + nome + " -> " + numero);
    }

    public void rimuoviContatto(String nome) {
        if (contatti.containsKey(nome)) {
            contatti.remove(nome);
            System.out.println("Contatto rimosso: " + nome);
        } else {
            System.out.println("Contatto non trovato: " + nome);
        }
    }

    public String cercaNomePerNumero(String numero) {
        for (Map.Entry<String, String> entry : contatti.entrySet()) {
            if (entry.getValue().equals(numero)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String cercaNumeroPerNome(String nome) {
        return contatti.get(nome);
    }

    public void stampaContatti() {
        if (contatti.isEmpty()) {
            System.out.println("Rubrica vuota.");
            return;
        }

        System.out.println("Contatti nella rubrica:");
        for (Map.Entry<String, String> entry : contatti.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + " - Telefono: " + entry.getValue());
        }
    }
}


