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

    @Override
    public String toString() 
    {
        String result = "";
        
        result += "Mechaniczny:\n";
        result += "\tmoc: " + moc + "\n";
        result += "\tzuzycie paliwa: " + zuzycie_paliwa + "\n";
        result += "\tprzebieg: " + przebieg;
        
        return result;
    }
}