package acz.gui.Klienci;

import acz.gui.Main;
import acz.gui.Window;
import acz.model.Klienci.Klient;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class WyswietlKlientowController 
{
   @FXML
    public void initialize()
    {
        for(int i=0; i<Main.manager_klientow.count(); i++)
        {
            lista.getItems().add(Main.manager_klientow.get(i));
        }
        
        if(Main.manager_klientow.count() > 0)
            lista.getSelectionModel().select(0);
        else
        {
            bt_modyfikuj.setDisable(true);
            bt_szczegoly.setDisable(true);
        }
        
    }
    
    @FXML
    private void modyfikuj() throws IOException
    {
        Main.wybrany_klient = lista.getSelectionModel().getSelectedItem();
        Window.setRoot("modyfikuj_klienta");
    }
    
    @FXML
    private void szczegoly() throws IOException
    {
        Main.wybrany_klient = lista.getSelectionModel().getSelectedItem();
        Window.setRoot("szczegoly_klienta");
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
    
    @FXML private ListView<Klient> lista;
    @FXML private Button bt_modyfikuj;
    
    @FXML private Button bt_szczegoly;
}
