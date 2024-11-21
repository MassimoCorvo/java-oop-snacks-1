package contobancario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContoBancario conto = new ContoBancario(120);

        conto.Deposito(100);
        conto.Prelievo(55);
        conto.StampaSaldo();

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il numero di conto");
        int numeroConto = input.nextInt();
        input.close();

        ContoBancario contoInput = new ContoBancario(numeroConto);
        contoInput.Deposito(10);
        contoInput.Prelievo(5);
        contoInput.StampaSaldo();
    }

    
}
