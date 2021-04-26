package acz.model.Klienci;

import acz.model.Adres;
import acz.model.Kontakt;
import acz.model.Wypozyczenia;

public abstract class Klient 
{
    private Adres adres;
    private Kontakt kontakt;
    private Wypozyczenia wypozyczenia;
    
    public Klient(Adres adres, Kontakt kontakt)
    {
        this.adres = adres;
        this.kontakt = kontakt;
        
        wypozyczenia = new Wypozyczenia();
    }

    public Wypozyczenia getWypozyczenia()
    {
        return wypozyczenia;
    }

    public Kontakt getKontakt() 
    {
        return kontakt;
    }

    public void setKontakt(Kontakt kontakt) 
    {
        this.kontakt = kontakt;
    }

    public Adres getAdres() 
    {
        return adres;
    }

    public void setAdres(Adres adres) 
    {
        this.adres = adres;
    }
    
    public String getId()
    {
        return "";
    }

    @Override
    public String toString() 
    {
        String result = "";
        
        result += "Klient\n";
        result += "{\n";
        result += adres.toString() + "\n";
        
        return result;
    }
    
}
