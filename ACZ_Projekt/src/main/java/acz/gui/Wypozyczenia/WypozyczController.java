package acz.gui.Wypozyczenia;

import acz.gui.Main;
import acz.gui.Window;
import acz.model.Klienci.Klient;
import acz.model.Pojazdy.Pojazd;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class WypozyczController 
{
    @FXML
    public void initialize()
    {
        for(int i=0; i<Main.manager_pojazdow.count(); i++)
        {
            lista_pojazdow.getItems().add(Main.manager_pojazdow.get(i));
        }
        if(Main.manager_pojazdow.count() > 0)
            lista_pojazdow.getSelectionModel().select(0);
    
        for(int i=0; i<Main.manager_klientow.count(); i++)
        {
            lista_klientow.getItems().add(Main.manager_klientow.get(i));
        }
        if(Main.manager_klientow.count() > 0)
            lista_klientow.getSelectionModel().select(0);
    }
    
    @FXML
    private void wypozycz() throws IOException
    {
        Main.wybrany_klient = lista_klientow.getSelectionModel().getSelectedItem();
        Main.wybrany_pojazd = lista_pojazdow.getSelectionModel().getSelectedItem();
        
        System.out.println(Main.wybrany_klient.toString());
        System.out.println(Main.wybrany_pojazd.toString());
    }
    
    @FXML
    private void filtrujPojazdy()
    {
        String filtr = tf_filtr_pojazd.getText();
        
        if(filtr.equals(""))
        {
            lista_pojazdow.getItems().clear();
            for(int i=0; i<Main.manager_pojazdow.count(); i++)
                lista_pojazdow.getItems().add(Main.manager_pojazdow.get(i));
        }
        else
        {
            lista_pojazdow.getItems().clear();
            for(int i=0; i<Main.manager_pojazdow.count(); i++)
                if(Main.manager_pojazdow.get(i).getID().contains(filtr))
                    lista_pojazdow.getItems().add(Main.manager_pojazdow.get(i));
        }
    }
    
    @FXML
    private void filtrujKlientow()
    {
        String filtr = tf_filtr_pojazd.getText();
        
        if(filtr.equals(""))
        {
            lista_klientow.getItems().clear();
            for(int i=0; i<Main.manager_klientow.count(); i++)
                lista_klientow.getItems().add(Main.manager_klientow.get(i));
        }
        else
        {
            lista_klientow.getItems().clear();
            for(int i=0; i<Main.manager_klientow.count(); i++)
            {
                if(Main.manager_klientow.get(i).getID().contains(filtr) ||
                    Main.manager_klientow.get(i).getNazwa().contains(filtr) ||
                    Main.manager_klientow.get(i).getNazwa2().contains(filtr) )
                {
                    lista_klientow.getItems().add(Main.manager_klientow.get(i));
                }
            }
        }
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
    private void switchToWyswietlKlientowWindow() throws IOException 
    {
        Window.setRoot("wyswietl_klientow");
    }
    
    @FXML
    private void switchToWypozyczWindow() throws IOException 
    {
        Window.setRoot("wypozycz");
    }
    
    @FXML
    private void displayAuthors() throws IOException
    {
        ;
    }
    
    ///-------------------------------------------------------------------------
    
    @FXML RadioButton rb_filtr_pojazd;
    @FXML RadioButton rb_filtr_klient;
    
    @FXML TextField tf_filtr_pojazd;
    @FXML TextField tf_filtr_klient;
    
    @FXML private ListView<Pojazd> lista_pojazdow;
    @FXML private ListView<Klient> lista_klientow;
}
