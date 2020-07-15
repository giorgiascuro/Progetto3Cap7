public class Fattoriale {
    public static int fattoriale(int n) {
        int risultato;
        if (n == 0) 
            risultato = 1;
        else
            risultato = fattoriale(n - 1) * n;
        return risultato;
    }
}