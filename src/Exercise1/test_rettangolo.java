package Exercise1;

import java.util.Scanner;

public class test_rettangolo {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("inserisci il valore della base e premi invio");
        double base = myScanner.nextDouble();
        System.out.println("inserisci il valore dell'altezza e premi invio");
        double altezza = myScanner.nextDouble();

        Rettangolo myRettangolo = new Rettangolo(base, altezza);
        System.out.println("l'area del rettangolo è "+myRettangolo.calcolaArea());
        System.out.println("il perimetro del rettangolo è "+myRettangolo.calcolaPerimetro());

        System.out.println();

        System.out.println("inserisci la base del primo rettangolo e premi invio");
        double base1 = myScanner.nextDouble();
        System.out.println("inserisci l'altezza del primo rettangolo e premi invio");
        double altezza1 = myScanner.nextDouble();

        Rettangolo firstRettangolo = new Rettangolo(base1, altezza1);

        System.out.println("inserisci la base del secondo rettangolo e premi invio");
        double base2 = myScanner.nextDouble();
        System.out.println("inserisci l'altezza del secondo rettangolo e premi invio");
        double altezza2 = myScanner.nextDouble();

        Rettangolo secondRettangolo = new Rettangolo(base2, altezza2);

        System.out.println("la somma delle aree dei rettangoli è "+(firstRettangolo.calcolaArea()+secondRettangolo.calcolaArea()));
        System.out.println("la somma dei perimetri dei rettangoli è "+(firstRettangolo.calcolaPerimetro()+secondRettangolo.calcolaPerimetro()));





    }
}
