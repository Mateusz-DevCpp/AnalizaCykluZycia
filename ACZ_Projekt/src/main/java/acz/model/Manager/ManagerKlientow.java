package acz.model.Manager;

import acz.model.Klienci.Klient;
import acz.model.Repozytoria.RepozytoriumKlientow;

public class ManagerKlientow implements Manager<Klient>
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
            if(klient_rep.get(i).getId().equals(newObj.getId()))
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
            if(klient_rep.get(i).getId().equals(obj.getId()))
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
            if(id.equals(klient_rep.get(i).getId()))
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
