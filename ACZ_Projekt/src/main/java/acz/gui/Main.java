package acz.gui;

import acz.model.Adres;
import acz.model.Klienci.*;
import acz.model.Napedy.*;
import acz.model.Pojazdy.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Pojazd k = new Transportowy(new Mechaniczny(1, 2, 3), "PTU0077", 1025.5f, 1000, 7, 10);
        System.err.println(k.toString());
        
        //Window.main(args);
    }
}
