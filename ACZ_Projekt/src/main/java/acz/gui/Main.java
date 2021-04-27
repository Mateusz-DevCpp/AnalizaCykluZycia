package acz.gui;

import acz.model.Klienci.Klient;
import acz.model.Pojazdy.Pojazd;
import acz.model.Manager.ManagerKlientow;
import acz.model.Manager.ManagerPojazdow;

public class Main
{
    public static ManagerKlientow manager_klientow;
    public static ManagerPojazdow manager_pojazdow;
    
    public static Klient wybranu_klient;
    public static Pojazd wybranu_pojazd;
    
    public static void main(String[] args) 
    {
        manager_klientow = new ManagerKlientow();
        manager_pojazdow = new ManagerPojazdow();
        
        Window.main(args);
    }
}
