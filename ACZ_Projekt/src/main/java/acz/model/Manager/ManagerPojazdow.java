package acz.model.Manager;

import acz.model.Pojazdy.Pojazd;
import acz.model.Repozytoria.RepozytoriumPojazdow;

public class ManagerPojazdow implements Manager<Pojazd>
{
    private RepozytoriumPojazdow pojazdy_rep;
    
    public ManagerPojazdow() 
    {
        pojazdy_rep = new RepozytoriumPojazdow();
    }
    
    @Override
    public boolean register(Pojazd newObj) 
    {
        for(int i=0; i<pojazdy_rep.size(); i++)
        {
            if(pojazdy_rep.get(i).getID().equals(newObj.getID()))
            {
                return false;
            }
        }
        
        pojazdy_rep.add(newObj);
        
        return true;
    }

    @Override
    public boolean unregister(Pojazd obj) 
    {
        for(int i=0; i<pojazdy_rep.size(); i++)
        {
            if(pojazdy_rep.get(i).getID().equals(obj.getID()))
            {
                pojazdy_rep.remove(obj);
                return true;
            }
        }
        return false;
    }

    @Override
    public int find(String id) 
    {
        for(int i=0; i<pojazdy_rep.size(); i++)
        {
            if(id.equals(pojazdy_rep.get(i).getID()))
            {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Pojazd get(int id) 
    {
        return pojazdy_rep.get(id);
    }

    @Override
    public int count() 
    {
        return pojazdy_rep.size();
    }
    
}
