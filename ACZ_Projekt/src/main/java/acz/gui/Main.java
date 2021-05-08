package acz.gui;

import acz.model.Adres;
import acz.model.Kontakt;
import acz.model.Klienci.*;
import acz.model.Pojazdy.*;
import acz.model.Manager.*;
import acz.model.Napedy.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Main
{
    public static ManagerKlientow manager_klientow;
    public static ManagerPojazdow manager_pojazdow;
    
    public static Klient wybrany_klient;
    public static Pojazd wybrany_pojazd;
    
    public static void main(String[] args) throws IOException 
    {
        manager_klientow = new ManagerKlientow();
        manager_pojazdow = new ManagerPojazdow();
        
        load();

        Window.main(args);
        
        save();
    }
    
    private static void makeTestData() throws IOException
    {
        manager_klientow.register(
                new OsobaPrywatna(
                new Adres("Warszawa", "Mickiewicza", "21/11", "99-255"), 
                new Kontakt("a_mickiewicz@poczta.pl", "777123654"), 
                "Adam", "Mickiewicz", "12358795513"));
        
        manager_klientow.register(
                new Firma(
                new Adres("Lodz", "Politechniki", "12", "65-654"), 
                new Kontakt("tago_kontakt@poczta.pl", "123456487"), 
                "TAGo", "PL 321-123-22-12"));
        
        manager_pojazdow.register(
                new Motor(
                new Mechaniczny(100, 200, 300), 
                "ELE 0123", 400, 500));
        
        manager_pojazdow.register(
                new Osobowy(
                new Mechaniczny(150, 250, 350), 
                "REG OIO", 450, 550, 5));

        manager_pojazdow.register(
                new Transportowy(
                new Mechaniczny(150, 250, 350), 
                "REG WWW", 450, 550, 5, 10));
        
        manager_pojazdow.register(
                new Rower(
                new Fizyczny(), 
                "ROW ERO", 455, 555));
    }    

    
    public static void save()
    {
        try 
        {
            FileOutputStream fos = null;
            
            fos = new FileOutputStream("dbf/save_file_cli.dbf");
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) 
            {
                oos.writeObject(manager_klientow);
            }
            
            fos = new FileOutputStream("dbf/save_file_poj.dbf");
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) 
            {
                oos.writeObject(manager_pojazdow);
            }
        }
        catch(IOException e) 
        {
            System.out.println("Blad zapisywania danych.");
        }
    }
    
    public static void load()
    {
        try
        {
            FileInputStream fis;
            
            fis = new FileInputStream("dbf/save_file_cli.dbf");
            try (ObjectInputStream readStream = new ObjectInputStream(fis)) 
            {
                manager_klientow = (ManagerKlientow) readStream.readObject();
            }
            
            fis = new FileInputStream("dbf/save_file_poj.dbf");
            try (ObjectInputStream readStream = new ObjectInputStream(fis)) 
            {
                manager_pojazdow = (ManagerPojazdow) readStream.readObject();
            }
        }
        catch(ClassNotFoundException | IOException e) 
        {
            System.out.println("Blad wczytywania danych.");
        }
    }
}
