package acz.model.Manager;

import acz.model.Klienci.Klient;
import acz.model.Repozytoria.RepozytoriumKlientow;
import java.io.Serializable;

public class ManagerKlientow implements Manager<Klient>, Serializable
{
    private RepozytoriumKlientow klient_rep;
    
    public ManagerKlientow() 
    {
        klient_rep = new RepozytoriumKlientow();
    }
    
    @Override
    public boolean register(Klient newObj) 
    {
        for(int i=0; i<klient_rep.size(); i++)
        {
            if(klient_rep.get(i).getID().equals(newObj.getID()))
            {
                return false;
            }
        }
        
        klient_rep.add(newObj);
        
        return true;
    }

    @Override
    public boolean unregister(Klient obj) 
    {
        for(int i=0; i<klient_rep.size(); i++)
        {
            if(klient_rep.get(i).getID().equals(obj.getID()))
            {
                klient_rep.remove(obj);
                return true;
            }
        }
        return false;
    }

    @Override
    public int find(String id) 
    {
        for(int i=0; i<klient_rep.size(); i++)
        {
            if(id.equals(klient_rep.get(i).getID()))
            {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Klient get(int id) 
    {
        return klient_rep.get(id);
    }

    @Override
    public int count() 
    {
        return klient_rep.size();
    }
    
}
