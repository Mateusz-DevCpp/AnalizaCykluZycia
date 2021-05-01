package acz.model.Pojazdy;

import acz.model.Napedy.Naped;

public class Motor extends Jednoslad
{
    public Motor(Naped naped, String id, float cena, float waga)
    {
        super(naped, id, cena, waga);
    }
    
    public int getIloscMiejsc()
    {
        return 2;
    }
    
    public String getType()
    {
        return "Motor";
    }
}
