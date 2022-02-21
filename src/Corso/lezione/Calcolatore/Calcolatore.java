package Corso.lezione.Calcolatore;

import java.util.Scanner;

public class Calcolatore {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Calcolatrice c = new Calcolatrice();

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        
        System.out.println(c.somma(a, b));
        c.divisione(a, b);
        c.moltiplicazione(a, b);
        c.sotrazzione(a, b);
    }

}
