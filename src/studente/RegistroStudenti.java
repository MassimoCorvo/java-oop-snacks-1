package studente;

public class RegistroStudenti {
    private Studente[] arrayStudenti;
    private int nextElementNull = 0;

    public RegistroStudenti() {
        this.arrayStudenti = new Studente[100];
    }

    public void AggiungiStudente(Studente nuovoStudente) {

        for (int i = 0; i < arrayStudenti.length; i++) {

            if (arrayStudenti[i] == null) {
                this.arrayStudenti[i] = nuovoStudente;
                nextElementNull++;
                break;
            }

        }

    }

    public void StampaRegistro() {
        if (nextElementNull == 0)
            System.out.println("Il registro è vuoto");
        else {
            for (int i = 0; i < nextElementNull; i++) {
                arrayStudenti[i].StampaIdentita();
            }
        }
    }
}
