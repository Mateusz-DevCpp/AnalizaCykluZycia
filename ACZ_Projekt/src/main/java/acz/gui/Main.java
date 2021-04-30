package acz.gui;

import acz.model.Adres;
import acz.model.Klienci.Firma;
import acz.model.Klienci.Klient;
import acz.model.Klienci.OsobaPrywatna;
import acz.model.Kontakt;
import acz.model.Pojazdy.Pojazd;
import acz.model.Manager.ManagerKlientow;
import acz.model.Manager.ManagerPojazdow;

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
        
        manager_klientow.register(new OsobaPrywatna(new Adres("miasto", "ulica", "mieszkanie", "kod"), new Kontakt("email", "telefon"), "imie", "nazwisko", "pespl"));
        manager_klientow.register(new Firma(new Adres("aha", "meh", "21", "65-654"), new Kontakt("mail", "123456487"), "TAGo", "NIP-123"));
        
        Window.main(args);
    }
}
