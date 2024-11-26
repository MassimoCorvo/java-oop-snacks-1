package studente;

public class RegistroStudenti {
    private Studente[] arrayStudenti;
    private int nextElementNull = 0;

    public RegistroStudenti() {
        this.arrayStudenti = new Studente[100];
    }

    public void AggiungiStudente(Studente nuovoStudente) {

        if ( this.nextElementNull < this.arrayStudenti.length ) {
            this.arrayStudenti[nextElementNull] = nuovoStudente;
            this.nextElementNull++;
        }

    }

    public void StampaRegistro() {
        if (this.nextElementNull == 0)
            System.out.println("Il registro è vuoto");
        else {
            for (int i = 0; i < nextElementNull; i++) {
                this.arrayStudenti[i].StampaIdentita();
            }
        }
    }
}
