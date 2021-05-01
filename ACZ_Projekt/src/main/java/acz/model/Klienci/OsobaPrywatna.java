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

    public String getImie() 
    {
        return imie;
    }

    public void setImie(String imie) 
    {
        this.imie = imie;
    }

    public String getNazwisko() 
    {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) 
    {
        this.nazwisko = nazwisko;
    }

    public String getID() 
    {
        return pesel;
    }

    public void setID(String pesel) 
    {
        this.pesel = pesel;
    }
    
    @Override
    public String toString() {
        String result = super.toString();
        
        result += "Imie: " + imie + "\n";
        result += "Nazwisko: " + nazwisko + "\n";
        result += "PESEL: " + pesel + "\n";
        
        return result;
    }
    
    public String getNazwa() 
    {
        return getImie();
    }
    
    public String getNazwa2() 
    {
        return getNazwisko();
    }
    
    public void setNazwa(String nazwa) 
    {
        setImie(nazwa);
    }
    
    public void setNazwa2(String nazwa) 
    {
        setNazwisko(nazwa);
    }
    
     public String getType()
    {
        return "OsobaPrywatna";
    }
}
