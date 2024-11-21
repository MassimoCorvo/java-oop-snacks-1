package studente;

public class Studente {
    private String nome;
    private String cognome;
    private int eta;

    public Studente(String nome, String cognome, int eta){

        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;

    }

    public void StampaIdentita(){
        
        System.out.println(this.nome + " " + this.cognome + ", " + this.eta + " anni");

    }

}
