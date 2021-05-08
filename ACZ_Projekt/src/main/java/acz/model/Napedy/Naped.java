package acz.model.Napedy;

import java.io.Serializable;

public abstract class Naped implements Serializable
{
    public Naped()
    {

    }
    
    public int getPrzebieg() 
    {
        return 0;
    }

    public void addPrzebieg(int przebieg)
    {
        ;
    }

    public float getMoc() 
    {
        return 0;
    }

    public float getZuzycie_paliwa() 
    {
        return 0;
    }
    
    public String getType()
    {
        return "";
    }
}
