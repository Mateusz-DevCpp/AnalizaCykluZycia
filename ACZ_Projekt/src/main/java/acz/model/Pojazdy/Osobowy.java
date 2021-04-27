package acz.model.Pojazdy;

import acz.model.Napedy.Naped;
import com.sun.glass.events.WindowEvent;

public class Osobowy extends Wieloslad 
{
    public Osobowy(Naped naped, String id, float cena, float waga, int ilosc_miejsc)
    {
        super(naped, id, cena, waga, ilosc_miejsc);
        
    }

    @Override
    public String toString() 
    {
        String result = super.toString();
        
        return result;
    }
    
}
