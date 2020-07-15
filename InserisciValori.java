import java.util.Scanner;

public class InserisciValori {
    public static void inserisciValori() {
        System.out.println("Inserisci un numero intero");
        Scanner tastiera = new Scanner(System.in);
        int numero = tastiera.nextInt();
        if (numero < 0) 
            System.out.println("errore: programma terminato");
        else {
            int risultato = Fattoriale.fattoriale(numero);
            System.out.println("il fattoriale di " + numero + " è " + risultato);
            inserisciValori();
        }
    }
}
        
    