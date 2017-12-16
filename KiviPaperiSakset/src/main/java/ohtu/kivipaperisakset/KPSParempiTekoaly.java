package ohtu.kivipaperisakset;

public class KPSParempiTekoaly extends KPS {

    private TekoalyParannettu tekoalyParannettu = new TekoalyParannettu(20);
    
    @Override
    public String annaSiirto() {
        String siirto = tekoalyParannettu.annaSiirto();
        
        System.out.println("Tietokone valitsi: " + siirto);
        
        return siirto;
    }

    @Override
    public void asetaSiirto(String ekanSiirto) {
        tekoalyParannettu.asetaSiirto(ekanSiirto);
    }

    
}
