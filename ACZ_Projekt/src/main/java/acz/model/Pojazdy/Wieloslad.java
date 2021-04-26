package acz.model.Pojazdy;

import acz.model.Napedy.Naped;

public abstract class Wieloslad extends Pojazd
{
    private int ilosc_miejsc;
    
    public Wieloslad(Naped naped, String id, float cena, float waga, int ilosc_miejsc)
    {
        super(naped, id, cena, waga);
        this.ilosc_miejsc = ilosc_miejsc;
    }

    @Override
    public String toString() 
    {
        String result = super.toString();
        
        result += "ilosc miejsc: " + Integer.toString(ilosc_miejsc) + "\n";
        
        return result;
    }
    
    
}
