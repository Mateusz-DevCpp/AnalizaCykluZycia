package acz.model.Repozytoria;

import acz.model.Adres;
import acz.model.Klienci.Firma;
import acz.model.Klienci.OsobaPrywatna;
import acz.model.Kontakt;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RepozytoriumKlientowTest {
    
    public RepozytoriumKlientowTest() {
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

    @Test
    public void testSomeMethod() {
        
        System.out.println("test_Main");
        System.out.println("----------=----------=----------=----------=----------=----------");

        Repozytorium rk = new RepozytoriumKlientow();
        
        rk.add(new OsobaPrywatna(new Adres("Lodz", "Brzozowa", "11/21", "12-123"), new Kontakt("AdamM@poczta.pl", "222555888"), "Adam", "Malysz", "12345678955"));
        rk.add(new OsobaPrywatna(new Adres("Lodz", "Brzozowa", "12/21", "12-123"), new Kontakt("WiktorZ@poczta.pl", "222555888"), "Wiktor", "Zak", "14725836955"));
        rk.add(new Firma(new Adres("Lodz", "Brzozowa", "12/21", "12-123"), new Kontakt("Firma@poczta.pl", "222555888"), "FirmaXD", "NIP-00125"));
        
        assertEquals(rk.size(), 3);
        
        System.out.println(rk.report());
        rk.remove(rk.get(0));
        
        assertEquals(rk.size(), 2);
        
        System.out.println(rk.get(0).toString());
        
        System.out.println("----------=----------=----------=----------=----------=----------");
    }
    
}
