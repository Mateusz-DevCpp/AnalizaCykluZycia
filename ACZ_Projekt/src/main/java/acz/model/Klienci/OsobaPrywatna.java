package acz.model.Klienci;

import acz.model.Adres;
import acz.model.Kontakt;

public class OsobaPrywatna extends Klient
{
    private String imie;
    private String nazwisko;
    private String pesel;
    
    public OsobaPrywatna(Adres adres, Kontakt kontakt, String imie, String nazwisko, String pesel)
    {
        super(adres, kontakt);
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }
    
    public String getId()
    {
        return pesel;
    }
    
    @Override
    public String toString() {
        String result = super.toString();
        
        result += "imie: " + imie + "\n";
        result += "nazwisko: " + nazwisko + "\n";
        result += "pesel: " + pesel + "\n";
        result += "}";
        
        return result;
    }
}
