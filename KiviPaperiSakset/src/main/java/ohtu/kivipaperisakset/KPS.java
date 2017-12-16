
package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class KPS {
    
    protected static final Scanner scanner = new Scanner(System.in);

    public static KPS luoPelaajaVsPelaaja() {
        return new KPSPelaajaVsPelaaja();
    }
    
    public static KPS luoYksinpeli() {
        return new KPSTekoaly();
    }
    
    public static KPS luoPahaYksinpeli() {
        return new KPSParempiTekoaly();
    }
    
    public void pelaa() {
        Tuomari tuomari = new Tuomari();

        System.out.print("Ensimmäisen pelaajan siirto: ");
        String ekanSiirto = scanner.nextLine();

        String tokanSiirto = annaSiirto();

        while (onkoOkSiirto(ekanSiirto) && onkoOkSiirto(tokanSiirto)) {
            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();

            System.out.print("Ensimmäisen pelaajan siirto: ");
            ekanSiirto = scanner.nextLine();

            tokanSiirto = annaSiirto();
            asetaSiirto(ekanSiirto);
        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }
    
    public abstract String annaSiirto();
    
    public abstract void asetaSiirto(String ekanSiirto);
    
    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
}
