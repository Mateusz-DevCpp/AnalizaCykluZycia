package acz.model.Klienci;

import acz.model.Adres;
import acz.model.Kontakt;

public class Firma extends Klient
{
    private String nip;
    private String nazwa;

    public String getNazwa() 
    {
        return nazwa;
    }

    public void setNazwa(String nazwa) 
    {
        this.nazwa = nazwa;
    }
    
    public Firma(Adres adres, Kontakt kontakt, String nazwa, String nip)
    {
        super(adres, kontakt);
        this.nazwa = nazwa;
        this.nip = nip;
    }
    
    public String getID()
    {
        return nip;
    }

    @Override
    public String toString() {
        String result = super.toString();
        
        result +=  nazwa + "\n";
        result += "nip: " + nip + "\n";
        
        return result;
    }
    
    public String getType()
    {
        return "Firma";
    }
}
