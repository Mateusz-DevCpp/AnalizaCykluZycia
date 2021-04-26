/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acz.model.Manager;

import acz.model.Adres;
import acz.model.Klienci.Firma;
import acz.model.Klienci.Klient;
import acz.model.Klienci.OsobaPrywatna;
import acz.model.Kontakt;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mateusz
 */
public class ManagerKlientowTest {
    
    public ManagerKlientowTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of register method, of class ManagerKlientow.
     */
    @Test
    public void testRegister() {
        ManagerKlientow mk = new ManagerKlientow();
        
        assertTrue(mk.register(new OsobaPrywatna(new Adres("Turek", "Brzozowa", "5", "62-700"), new Kontakt("MD@poczta.pl", "000777000"), "Mateusz", "Darul", "11155577766")));
        assertTrue(mk.register(new OsobaPrywatna(new Adres("Turek", "Browarna", "6", "62-700"), new Kontakt("KB@poczta.pl", "000666000"), "Kinga", "Blasxzczyk", "11166677766")));
        assertFalse(mk.register(new OsobaPrywatna(new Adres("Turek", "Browarna", "6", "62-700"), new Kontakt("KB@poczta.pl", "000666000"), "Kinga", "Blasxzczyk", "11166677766")));
    }

    /**
     * Test of unregister method, of class ManagerKlientow.
     */
    @Test
    public void testUnregister() {
        ManagerKlientow mk = new ManagerKlientow();
        
        mk.register(new OsobaPrywatna(new Adres("Turek", "Brzozowa", "5", "62-700"), new Kontakt("MD@poczta.pl", "000777000"), "Mateusz", "Darul", "11155577766"));
        mk.register(new OsobaPrywatna(new Adres("Turek", "Browarna", "6", "62-700"), new Kontakt("KB@poczta.pl", "000666000"), "Kinga", "Blasxzczyk", "11166677766"));
        
        assertTrue(mk.unregister(mk.get(0)));
        assertEquals(mk.count(), 1);
        
        assertFalse(mk.unregister(new Firma(null, null, "brak", "brak")));
    }

    /**
     * Test of find method, of class ManagerKlientow.
     */
    @Test
    public void testFind() {
        ManagerKlientow mk = new ManagerKlientow();
        
        mk.register(new OsobaPrywatna(new Adres("Turek", "Brzozowa", "5", "62-700"), new Kontakt("MD@poczta.pl", "000777000"), "Mateusz", "Darul", "11155577766"));
        mk.register(new OsobaPrywatna(new Adres("Turek", "Browarna", "6", "62-700"), new Kontakt("KB@poczta.pl", "000666000"), "Kinga", "Blasxzczyk", "11166677766"));
        
        assertEquals(mk.find("11155577766"), 0);
        assertEquals(mk.find("0"), -1);
    }

    /**
     * Test of get method, of class ManagerKlientow.
     */
    @Test
    public void testGet() {
        ManagerKlientow mk = new ManagerKlientow();
        
        mk.register(new OsobaPrywatna(new Adres("Turek", "Brzozowa", "5", "62-700"), new Kontakt("MD@poczta.pl", "000777000"), "Mateusz", "Darul", "11155577766"));
        
        Klient klient = new Firma(new Adres("Warszawa", "Wrobla", "12/21", "45-985"), new Kontakt("jakis@poczta.pl", "123456789"), "Nazwa", "NIP-121212");
        mk.register(klient);
        
        mk.register(new OsobaPrywatna(new Adres("Turek", "Browarna", "6", "62-700"), new Kontakt("KB@poczta.pl", "000666000"), "Kinga", "Blasxzczyk", "11166677766"));
        
        assertEquals(mk.get(1), klient);
    }

    /**
     * Test of count method, of class ManagerKlientow.
     */
    @Test
    public void testCount() {
        ManagerKlientow mk = new ManagerKlientow();
        
        mk.register(new OsobaPrywatna(new Adres("Turek", "Brzozowa", "5", "62-700"), new Kontakt("MD@poczta.pl", "000777000"), "Mateusz", "Darul", "11155577766"));
        assertEquals(mk.count(), 1);
        
        mk.register(new OsobaPrywatna(new Adres("Turek", "Browarna", "6", "62-700"), new Kontakt("KB@poczta.pl", "000666000"), "Kinga", "Blasxzczyk", "11166677766"));
        assertEquals(mk.count(), 2);
    }
    
}
