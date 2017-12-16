package ohtu.kivipaperisakset;

public class KPSPelaajaVsPelaaja extends KPS {

    @Override
    public String annaSiirto() {
        System.out.print("Toisen pelaajan siirto: ");
        String tokanSiirto = scanner.nextLine();
        
        return tokanSiirto;
    }

    @Override
    public void asetaSiirto(String ekanSiirto) {
    }
}