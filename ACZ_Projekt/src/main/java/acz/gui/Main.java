package acz.gui;

import acz.model.Adres;
import acz.model.Klienci.Firma;
import acz.model.Klienci.Klient;
import acz.model.Klienci.OsobaPrywatna;
import acz.model.Kontakt;
import acz.model.Pojazdy.Pojazd;
import acz.model.Manager.ManagerKlientow;
import acz.model.Manager.ManagerPojazdow;
import acz.model.Napedy.Fizyczny;
import acz.model.Napedy.Mechaniczny;
import acz.model.Pojazdy.Motor;
import acz.model.Pojazdy.Osobowy;
import acz.model.Pojazdy.Rower;

public class Main
{
    public static ManagerKlientow manager_klientow;
    public static ManagerPojazdow manager_pojazdow;
    
    public static Klient wybrany_klient;
    public static Pojazd wybrany_pojazd;
    
    public static void main(String[] args) 
    {
        manager_klientow = new ManagerKlientow();
        manager_pojazdow = new ManagerPojazdow();
        
        makeTestData();

        Window.main(args);
    }
    
    private static void makeTestData()
    {
        manager_klientow.register(new OsobaPrywatna(new Adres("miasto", "ulica", "mieszkanie", "kod"), new Kontakt("email", "telefon"), "imie", "nazwisko", "pespl"));
        manager_klientow.register(new Firma(new Adres("aha", "meh", "21", "65-654"), new Kontakt("mail", "123456487"), "TAGo", "NIP-123"));
        
        manager_pojazdow.register(new Motor(new Mechaniczny(100, 200, 300), "REG ORO", 400, 500));
        manager_pojazdow.register(new Osobowy(new Mechaniczny(150, 250, 350), "REG OIO", 450, 550, 5));
        manager_pojazdow.register(new Rower(new Fizyczny(), "ROW ERO", 455, 555));
    }
}
