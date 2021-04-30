package acz.gui.Pojazdy;

import acz.gui.Main;
import acz.gui.Window;

import acz.model.Pojazdy.Pojazd;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class WyswietlPojazdyController 
{
    @FXML
    public void initialize()
    {
        for(int i=0; i<Main.manager_pojazdow.count(); i++)
        {
            lista.getItems().add(Main.manager_pojazdow.get(i));
        }
        
        if(Main.manager_pojazdow.count() > 0)
            lista.getSelectionModel().select(0);
        else
            bt_modyfikuj.setDisable(true);
        
    }
    
    @FXML
    private void modyfikuj() throws IOException
    {
        Main.wybrany_pojazd = lista.getSelectionModel().getSelectedItem();
        Window.setRoot("modyfikuj_pojazd");
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
    private void switchToDodajKlientaWindow() throws IOException 
    {
        Window.setRoot("dodaj_klienta");
    }
    
    @FXML
    private void switchToWyswietlKlientowWindow() throws IOException 
    {
        Window.setRoot("wyswietl_klientow");
    }
    
    @FXML
    private void displayAuthors() throws IOException
    {
        ;
    }
    
    ///-------------------------------------------------------------------------
    
    @FXML private ListView<Pojazd> lista;
    @FXML private Button bt_modyfikuj;
    
}
