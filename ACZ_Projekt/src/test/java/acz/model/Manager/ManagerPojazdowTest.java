package acz.model.Manager;

import acz.model.Napedy.Mechaniczny;
import acz.model.Napedy.Naped;
import acz.model.Pojazdy.Osobowy;
import acz.model.Pojazdy.Pojazd;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ManagerPojazdowTest {
    
    public ManagerPojazdowTest() {
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
     * Test of register method, of class ManagerPojazdow.
     */
    @Test
    public void testRegister() {
        ManagerPojazdow mp = new ManagerPojazdow();
        
        assertTrue(mp.register(new Osobowy(new Mechaniczny(170, 10, 190000), "QAZ QWE", 100, 750, 5)));
        assertEquals(mp.count(), 1);
        assertTrue(mp.register(new Osobowy(new Mechaniczny(170, 10, 190000), "OBE WUS", 100, 750, 5)));
        assertEquals(mp.count(), 2);
        assertFalse(mp.register(new Osobowy(new Mechaniczny(170, 10, 190000), "QAZ QWE", 100, 750, 5)));
        assertEquals(mp.count(), 2);
    }

    /**
     * Test of unregister method, of class ManagerPojazdow.
     */
    @Test
    public void testUnregister() {
        ManagerPojazdow mp = new ManagerPojazdow();
        
        mp.register(new Osobowy(new Mechaniczny(170, 10, 190000), "QAZ QWE", 100, 750, 5));
        mp.register(new Osobowy(new Mechaniczny(170, 10, 190000), "OBE WUS", 100, 750, 5));
        
        assertEquals(mp.count(), 2);
        assertTrue(mp.unregister(mp.get(0)));
        assertEquals(mp.count(), 1);
        assertEquals(mp.get(0).getId(), "OBE WUS");
        assertTrue(mp.unregister(mp.get(0)));
        assertEquals(mp.count(), 0);
        
        assertFalse(mp.unregister(new Osobowy(null, "0", 0, 0, 0)));
    }

    /**
     * Test of find method, of class ManagerPojazdow.
     */
    @Test
    public void testFind() {
        ManagerPojazdow mp = new ManagerPojazdow();
        
        mp.register(new Osobowy(new Mechaniczny(170, 10, 190000), "QAZ QWE", 100, 750, 5));
        mp.register(new Osobowy(new Mechaniczny(170, 10, 190000), "OBE WUS", 100, 750, 5));
        
        assertEquals(mp.find("QAZ QWE"), 0);
        assertEquals(mp.find("OBE WUS"), 1);
        assertEquals(mp.find("0"), -1);
    }

    /**
     * Test of get method, of class ManagerPojazdow.
     */
    @Test
    public void testGet() {
        ManagerPojazdow mp = new ManagerPojazdow();
        
        mp.register(new Osobowy(new Mechaniczny(170, 10, 190000), "QAZ QWE", 100, 750, 5));
        Pojazd pojazd = new Osobowy(new Mechaniczny(115, 6, 75000), "CAR IOI", 210, 100, 4);
        mp.register(pojazd);
        mp.register(new Osobowy(new Mechaniczny(170, 10, 190000), "OBE WUS", 100, 750, 5));
        
        assertEquals(mp.get(1), pojazd);
    }
    
    /**
     * Test of count method, of class ManagerKlientow.
     */
    @Test
    public void testCount() {
        ManagerPojazdow mp = new ManagerPojazdow();
        
        mp.register(new Osobowy(new Mechaniczny(170, 10, 190000), "QAZ QWE", 100, 750, 5));
        mp.register(new Osobowy(new Mechaniczny(170, 10, 190000), "OBE WUS", 100, 750, 5));
        
        assertEquals(mp.count(), 2);
        
        mp.register(new Osobowy(new Mechaniczny(170, 10, 190000), "OBI KSD", 100, 750, 5));
        
        assertEquals(mp.count(), 3);
    }
}
