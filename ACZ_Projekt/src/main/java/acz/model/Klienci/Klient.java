package acz.model.Klienci;

import acz.model.Adres;

public abstract class Klient 
{
    private Adres adres;
    
    public Klient(Adres adres)
    {
        this.adres = adres;
    }

    @Override
    public String toString() {
        String result = "";
        
        result += "Klient\n";
        result += "{\n";
        result += adres.toString() + "\n";
        
        return result;
    }
    
}
