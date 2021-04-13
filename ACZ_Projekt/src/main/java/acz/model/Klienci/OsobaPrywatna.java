package acz.model.Klienci;

import acz.model.Adres;

public class OsobaPrywatna extends Klient
{
    private String imie;
    private String nazwisko;
    private String pesel;
    
    public OsobaPrywatna(Adres adres, String imie, String nazwisko, String pesel)
    {
        super(adres);
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
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
