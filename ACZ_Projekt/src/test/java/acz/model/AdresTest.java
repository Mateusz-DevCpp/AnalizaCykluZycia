package acz.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdresTest 
{
    
    public AdresTest() 
    {
    }
    
    @BeforeAll
    public static void setUpClass() 
    {
    }
    
    @AfterAll
    public static void tearDownClass() 
    {
    }
    
    @BeforeEach
    public void setUp() 
    {
    }
    
    @AfterEach
    public void tearDown() 
    {
    }

    @Test
    public void testConstructorSetterGetter() 
    {
        System.out.println("test_Constructor_Setter_Getter");
        
        String miasto = "Warszawa";
        String ulica = "Brzozowa";
        String mieszkanie = "21H/11";
        String kod_pocztowy = "99-123";
        
        String change = "_plus";
        
        Adres adres = new Adres(miasto, ulica, mieszkanie, kod_pocztowy);
        
        assertEquals(adres.getMiasto(), miasto);
        assertEquals(adres.getUlica(), ulica);
        assertEquals(adres.getMieszkanie(), mieszkanie);
        assertEquals(adres.getKodPocztowy(), kod_pocztowy);
        
        adres.setMiasto(miasto+change);
        adres.setUlica(ulica+change);
        adres.setMieszkanie(mieszkanie+change);
        adres.setKodPocztowy(kod_pocztowy+change);
        
        assertEquals(adres.getMiasto(), miasto+change);
        assertEquals(adres.getUlica(), ulica+change);
        assertEquals(adres.getMieszkanie(), mieszkanie+change);
        assertEquals(adres.getKodPocztowy(), kod_pocztowy+change);
    }
    
    @Test
    public void testMain() 
    {
        System.out.println("test_Main");
        System.out.println("----------=----------=----------=----------=----------=----------");
        
        Adres adres = new Adres("Warszawa", "Brzozowa", "21H/11", "99-123");
        System.out.println(adres.toString());
        
        System.out.println("----------=----------=----------=----------=----------=----------");
    }
}
