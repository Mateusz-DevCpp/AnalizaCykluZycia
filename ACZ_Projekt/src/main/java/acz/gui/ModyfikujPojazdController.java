package acz.gui;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ModyfikujPojazdController 
{
    @FXML
    public void initialize()
    {
        cena.setText(Float.toString(Main.wybrany_pojazd.getCena()));
        nr_rejestracyjny.setText(Main.wybrany_pojazd.getId());
    }
    
    @FXML
    public void modyfikuj() throws IOException
    {
        Main.wybrany_pojazd.setCena(Float.parseFloat(cena.getText()));
        Main.wybrany_pojazd.setId(nr_rejestracyjny.getText());
        goToMainWindow();
    }
    
    @FXML
    private void goToMainWindow() throws IOException
    {
        Window.setRoot("main");
    }
    
    @FXML
    private void switchToDodajPojazdWindow() throws IOException 
    {
        Window.setRoot("dodaj_pojazd");
    }
    
    @FXML
    private void switchToWyswietlPojazdyWindow() throws IOException 
    {
        Window.setRoot("wyswietl_pojazdy");
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
    
    ///-------------------------------------------------------------------------
    
    @FXML TextField cena;
    @FXML TextField nr_rejestracyjny;
    
}
