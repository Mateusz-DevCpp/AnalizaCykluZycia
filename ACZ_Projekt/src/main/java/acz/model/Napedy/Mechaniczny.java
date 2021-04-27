package acz.model.Napedy;

public class Mechaniczny extends Naped
{
    private float moc;
    private float zuzycie_paliwa;
    private int przebieg;
    
    public Mechaniczny(float moc, float zuzycie_paliwa, int przebieg)
    {
        super();
        this.moc = moc;
        this.zuzycie_paliwa = zuzycie_paliwa;
        this.przebieg = przebieg;
    }

    public int getPrzebieg() 
    {
        return przebieg;
    }

    public void addPrzebieg(int przebieg) 
    {
        this.przebieg += przebieg;
    }

    public float getMoc() 
    {
        return moc;
    }

    public float getZuzycie_paliwa() 
    {
        return zuzycie_paliwa;
    }

    @Override
    public String toString() 
    {
        String result = "";
        
        result += "Naped mechaniczny:\n";
        result += "\tmoc: " + moc + "\n";
        result += "\tzuzycie paliwa: " + zuzycie_paliwa + "\n";
        result += "\tprzebieg: " + przebieg;
        
        return result;
    }
}
