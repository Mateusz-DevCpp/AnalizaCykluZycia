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
    
    public String getID()
    {
        return "";
    }
    
    public void setID(String id)
    {
        ;
    }

    @Override
    public String toString() 
    {
        String result = "";
        
        //result += "Klient: ";
        //result += adres.toString() + "\n";
        //result += kontakt.toString() + "\n";
        
        return result;
    }

    public String getNazwa() 
    {
        return "";
    }
    
    public String getNazwa2() 
    {
        return "";
    }

    public void setNazwa(String nazwa) 
    {
        ;
    }
    
    public void setNazwa2(String nazwa) 
    {
        ;
    }
    
    public String getType()
    {
        return "";
    }
}
