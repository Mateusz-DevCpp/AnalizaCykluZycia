package acz.gui.Wypozyczenia;

import acz.gui.Main;
import acz.gui.Window;
import acz.model.Klienci.Klient;
import acz.model.Pojazdy.Pojazd;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;

public class OddajController 
{
    @FXML
    public void initialize()
    {
        for(int i=0; i<Main.manager_klientow.count(); i++)
        {
            lista_klientow.getItems().add(Main.manager_klientow.get(i));
        }
        if(Main.manager_klientow.count() > 0)
            lista_klientow.getSelectionModel().select(0);
    }
    
    @FXML
    private void oddaj() throws IOException
    {
        Main.wybrany_klient.getWypozyczenia().oddaj(Main.wybrany_pojazd);
        goToMainWindow();
    }
    
    @FXML
    private void filtrujPojazdy()
    {
        String filtr = tf_filtr_pojazd.getText();
        
        lista_pojazdow.getItems().clear();
        
        if(filtr.equals(""))
        {
            for(int i=0; i<Main.manager_pojazdow.count(); i++)
                lista_pojazdow.getItems().add(Main.manager_pojazdow.get(i));
        }
        else
        {
            for(int i=0; i<Main.manager_pojazdow.count(); i++)
                if(Main.manager_pojazdow.get(i).getID().contains(filtr) ||
                   Main.manager_pojazdow.get(i).getType().contains(filtr) )
                {
                    lista_pojazdow.getItems().add(Main.manager_pojazdow.get(i));
                }
        }
        
        wybranoPojazd();
    }
    
    @FXML
    private void filtrujKlientow()
    {
        String filtr = tf_filtr_klient.getText();
        
        lista_klientow.getItems().clear();
        
        if(filtr.equals(""))
        {
            for(int i=0; i<Main.manager_klientow.count(); i++)
                lista_klientow.getItems().add(Main.manager_klientow.get(i));
        }
        else
        {
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
        
        wybranoKlienta();
    }
    
    @FXML
    private void wybranoKlienta()
    {
        bt_oddaj.setDisable(true);
        lista_pojazdow.getItems().clear();
        Main.wybrany_klient = lista_klientow.getSelectionModel().getSelectedItem();
        
        if(lista_klientow.getSelectionModel().isEmpty())
        {
            ta_wybrany_klient.setText("BRAK");
        }
        else
        {
            ta_wybrany_klient.setText(lista_klientow.getSelectionModel().getSelectedItem().toString());
        }
        
        for(int i=0; i<Main.wybrany_klient.getWypozyczenia().ilosc(); i++)
        {
            lista_pojazdow.getItems().add(Main.wybrany_klient.getWypozyczenia().get(i));
        }
        
        if(lista_pojazdow.getSelectionModel().isEmpty())
        {
            ta_wybrany_pojazd.setText("BRAK");
        }
        else
        {
            ta_wybrany_pojazd.setText(lista_pojazdow.getSelectionModel().getSelectedItem().toString());
        }
    }
    
    @FXML
    private void wybranoPojazd()
    {
        Main.wybrany_pojazd = lista_pojazdow.getSelectionModel().getSelectedItem();
        
        if(lista_pojazdow.getSelectionModel().isEmpty())
        {
            ta_wybrany_pojazd.setText("BRAK");
        }
        else
        {
            ta_wybrany_pojazd.setText(lista_pojazdow.getSelectionModel().getSelectedItem().toString());
            bt_oddaj.setDisable(false);
        }
    }
    
    @FXML
    private void goToMainWindow() throws IOException
    {
        Window.setRoot("main");
    }
    
    @FXML
    private void switchToWypozyczWindow() throws IOException 
    {
        Window.setRoot("wypozycz");
    }
    
    @FXML
    private void switchToOddajWindow() throws IOException 
    {
        Window.setRoot("oddaj");
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
    private void displayAuthors() throws IOException
    {
        ;
    }
    
    ///-------------------------------------------------------------------------
    @FXML Label lb_message;
    
    @FXML Button bt_oddaj;
    
    @FXML RadioButton rb_filtr_pojazd;
    @FXML RadioButton rb_filtr_klient;
    
    @FXML TextField tf_filtr_pojazd;
    @FXML TextField tf_filtr_klient;
    
    @FXML TextArea ta_wybrany_pojazd;
    @FXML TextArea ta_wybrany_klient;
    
    @FXML private ListView<Pojazd> lista_pojazdow;
    @FXML private ListView<Klient> lista_klientow;
}