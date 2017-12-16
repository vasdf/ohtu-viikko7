package ohtu.kivipaperisakset;

public class KPSTekoaly extends KPS {

    private Tekoaly tekoaly = new Tekoaly();

    @Override
    public String annaSiirto() {
        String siirto = tekoaly.annaSiirto();
        
        System.out.println("Tietokone valitsi: " + siirto);
        
        return siirto;
    }    

    @Override
    public void asetaSiirto(String ekanSiirto) {   
    }    
}