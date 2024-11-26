package contobancario;

public class ContoBancario {
    private int numeroDiConto;
    private int saldoConto;

    public ContoBancario(int numeroDiConto){

        this.numeroDiConto = numeroDiConto;
        this.saldoConto = 0;

    }

    public void Deposito(int soldiDaDepositare){

        if(soldiDaDepositare > 0)
        this.saldoConto += soldiDaDepositare;

    }

    public void Prelievo(int soldiDaPrelevare){

        if(soldiDaPrelevare > 0 && this.saldoConto >= soldiDaPrelevare)
        this.saldoConto -= soldiDaPrelevare;

    }

    public void StampaSaldo(){
        System.out.println("Saldo disponibile: " + this.saldoConto);
    }
}
