package acz.model.Pojazdy;

import acz.model.Napedy.Naped;

public abstract class Pojazd 
{
    private Naped naped;
    private String id;
    private float cena;
    private float waga;
    private boolean wypozyczony;
    
    public Pojazd(Naped naped, String id, float cena, float waga)
    {
        this.naped = naped;
        this.id = id;
        this.cena = cena;
        this.waga = waga;
        
        this.wypozyczony = false;
    }

    @Override
    public String toString() 
    {
        String result = "";
        
        result += "Pojazd:\n";
        result += "{\n";
        result += "id: " + id + "\n";
        result += naped.toString() + "\n";
        result += "cena: " + cena + "\n";
        result += "waga: " + waga + "\n";
        
        return result;
    }
    
    public Naped getNaped() 
    {
        return naped;
    }

    public void setNaped(Naped naped) 
    {
        this.naped = naped;
    }

    public String getId() 
    {
        return id;
    }

    public void setId(String id) 
    {
        this.id = id;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) 
    {
        this.cena = cena;
    }

    public float getWaga() 
    {
        return waga;
    }

    public void setWaga(float waga) 
    {
        this.waga = waga;
    }
    
    public boolean isWypozyczony() 
    {
        return wypozyczony;
    }

    public void setWypozyczony(boolean wypozyczony) 
    {
        this.wypozyczony = wypozyczony;
    }
}
