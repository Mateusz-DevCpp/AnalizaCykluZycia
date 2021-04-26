package acz.model.Repozytoria;

import acz.model.Napedy.Mechaniczny;
import acz.model.Pojazdy.Transportowy;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RepozytoriumPojazdowTest {
    
    public RepozytoriumPojazdowTest() {
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

        Repozytorium rp = new RepozytoriumPojazdow();

        rp.add(new Transportowy(new Mechaniczny(250, 20, 110000), "ABC DEF", 125, 5000, 2, 25000));
        rp.add(new Transportowy(new Mechaniczny(250, 20, 110000), "GHI JKL", 230, 2500, 12, 1000));
        rp.add(new Transportowy(new Mechaniczny(250, 20, 110000), "DEF JKL", 75, 2000, 6, 1000));
        
        assertEquals(rp.size(), 3);
        
        System.out.println(rp.report());
        rp.remove(rp.get(0));
        
        assertEquals(rp.size(), 2);
        
        System.out.println(rp.get(0).toString());
        
        System.out.println("----------=----------=----------=----------=----------=----------");
    }
    
}
