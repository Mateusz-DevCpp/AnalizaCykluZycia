package acz.model;

import acz.model.Pojazdy.Pojazd;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Wypozyczenia 
{
    private List<Pojazd> wypozyczenia;

    public Wypozyczenia() {
        wypozyczenia = new ArrayList<Pojazd>();
    }
    
    public int ilosc()
    {
        return wypozyczenia.size();
    }
    
    public boolean pozycz(Pojazd pojazd)
    {
        if(pojazd.isWypozyczony())
        {
            return false;
        }
        else
        {
            wypozyczenia.add(pojazd);
            pojazd.setWypozyczony(true);
            return true;
        }
    }
    
    public float oddaj(Pojazd pojazd)
    {
        for(int i=0; i<wypozyczenia.size(); i++)
        {
            if(wypozyczenia.get(i).getID().equals(pojazd.getID()))
            {
                Random random = new Random();
                int rand_int = random.nextInt(6) + 1;
                
                float cena = wypozyczenia.get(i).getCena() * rand_int;
                wypozyczenia.get(i).getNaped().addPrzebieg(rand_int*225);
                wypozyczenia.get(i).setWypozyczony(false);
                
                wypozyczenia.remove(pojazd);
                return cena;
            }
        }
        return 0;
    }
    
    public Pojazd get(int id)
    {
        return wypozyczenia.get(id);
    }
}
