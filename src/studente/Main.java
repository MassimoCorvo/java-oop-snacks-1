package studente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Studente studente1 = new Studente("Sergio", "Rossi", 20);
        Studente studente2 = new Studente("Lorenzo", "Verdi", 34);
        Studente studente3 = new Studente("Samuele", "Marrone", 55);
        //studente1.StampaIdentita();
        //studente2.StampaIdentita();
        //studente3.StampaIdentita();

        RegistroStudenti registro = new RegistroStudenti();
        registro.AggiungiStudente(studente1);
        registro.AggiungiStudente(studente2);
        registro.AggiungiStudente(studente3);

        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il nome dello studente");
        String nome = input.nextLine();

        System.out.println("Inserisci il cognome dello studente");
        String cognome = input.nextLine();

        System.out.println("Inserisci l'età dello studente");
        int eta = input.nextInt();

        input.close();

        Studente studenteInput = new Studente(nome, cognome, eta);
        registro.AggiungiStudente(studenteInput);

        registro.StampaRegistro();

    }
}
