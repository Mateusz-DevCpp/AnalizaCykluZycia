package acz.gui;

import java.io.IOException;
import javafx.fxml.FXML;

public class MainController {
    
    @FXML
    private void switchToDodajPojazdWindow() throws IOException 
    {
        Window.setRoot("dodaj_pojazd");
    }
    
    @FXML
    private void switchToDodajKlientaWindow() throws IOException 
    {
        Window.setRoot("dodaj_klienta");
    }
    
    @FXML
    private void displayAuthors() throws IOException
    {
        ;
    }
    
}
