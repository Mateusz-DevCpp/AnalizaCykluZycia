package acz.model.Pojazdy;

import acz.model.Napedy.Naped;

public class Rower extends Jednoslad
{
    public Rower(Naped naped, String id, float cena, float waga)
    {
        super(naped, id, cena, waga);
    }
    
    public int getIloscMiejsc()
    {
        return 1;
    }   
    
    public String getType()
    {
        return "Rower";
    }
}
