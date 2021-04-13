package acz.model.Pojazdy;

import acz.model.Napedy.Naped;

public class Transportowy extends Wieloslad
{
    private int max_udzwig;
    
    public Transportowy(Naped naped, String id, float cena, float waga, int ilosc_miejsc, int max_udzwig)
    {
        super(naped, id, cena, waga, ilosc_miejsc);
        this.max_udzwig = max_udzwig;
    }

    @Override
    public String toString() 
    {
        String result = super.toString();
        
        result += "udzwig: " + Integer.toString(max_udzwig) + "\n";
        result += "}";
        
        return result;
    }
    
    public int getMax_udzwig() 
    {
        return max_udzwig;
    }
    
}
