package acz.model.Klienci;

import acz.model.Adres;

public class Firma extends Klient
{
    private String nip;
    
    public Firma(Adres adres, String nip)
    {
        super(adres);
        this.nip = nip;
    }

    @Override
    public String toString() {
        String result = super.toString();
        
        result += "nip: " + nip + "\n";
        result += "}";
        
        return result;
    }
}
