/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acz.model;

import acz.model.Klienci.Klient;
import acz.model.Klienci.OsobaPrywatna;
import acz.model.Napedy.Mechaniczny;
import acz.model.Pojazdy.Osobowy;
import acz.model.Pojazdy.Pojazd;
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
public class WypozyczeniaTest {
    
    public WypozyczeniaTest() {
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
     * Test of pozycz method, of class Wypozyczenia.
     */
    @Test
    public void testPozycz() {
        Klient klient = new OsobaPrywatna(new Adres("aaa", "bbb", "ccc", "ddd"), new Kontakt("eee", "TTT"), "ALA", "Ma", "Kota");
        Pojazd pojazd = new Osobowy(new Mechaniczny(100, 3, 0), "PTU", 100, 750, 2);
        
        assertTrue(klient.getWypozyczenia().pozycz(pojazd));
        assertEquals(klient.getWypozyczenia().ilosc(), 1);
        assertFalse(klient.getWypozyczenia().pozycz(pojazd));
        assertEquals(klient.getWypozyczenia().ilosc(), 1);
    }

    /**
     * Test of oddaj method, of class Wypozyczenia.
     */
    @Test
    public void testOddaj() {
        Klient klient = new OsobaPrywatna(new Adres("aaa", "bbb", "ccc", "ddd"), new Kontakt("eee", "TTT"), "ALA", "Ma", "Kota");
        Pojazd pojazd = new Osobowy(new Mechaniczny(100, 3, 0), "PTU", 100, 750, 2);
        
        assertTrue(klient.getWypozyczenia().pozycz(pojazd));
        assertEquals(klient.getWypozyczenia().ilosc(), 1);
        assertTrue(klient.getWypozyczenia().oddaj(pojazd) > 0);
        assertTrue(pojazd.getNaped().getPrzebieg() > 0);
        assertEquals(klient.getWypozyczenia().oddaj(pojazd), 0);
    }
    
}
