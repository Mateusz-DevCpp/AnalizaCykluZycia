package acz.gui.Klienci;

import acz.gui.Main;
import acz.gui.Window;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SzczegolyKlientaController 
{
    @FXML
    public void initialize() 
    {
        if(Main.wybrany_klient.getType().equals("OsobaPrywatna"))
        {
            lb_nazwa2.setText(Main.wybrany_klient.getNazwa2());
        }
        else
        {
            lb_nazwa_tag.setText("Nazwa:");
            lb_identyfikator_tag.setText("NIP:");
            lb_nazwa2_tag.setVisible(false);
            lb_nazwa2.setVisible(false);
        }

        lb_nazwa.setText(Main.wybrany_klient.getNazwa());
        lb_nazwa2.setText(Main.wybrany_klient.getNazwa2());
        identyfikator.setText(Main.wybrany_klient.getID());
        
        miasto.setText(Main.wybrany_klient.getAdres().getMiasto());
        ulica.setText(Main.wybrany_klient.getAdres().getUlica());
        mieszkanie.setText(Main.wybrany_klient.getAdres().getMieszkanie());
        kod_pocztowy.setText(Main.wybrany_klient.getAdres().getKodPocztowy());
        
        email.setText(Main.wybrany_klient.getKontakt().getEmail());
        nr_telefonu.setText(Main.wybrany_klient.getKontakt().getNrTelefonu());
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
    private void switchToDodajKlientaWindow() throws IOException 
    {
        Window.setRoot("dodaj_klienta");
    }
    
    @FXML
    private void switchToWyswietlPojazdyWindow() throws IOException 
    {
        Window.setRoot("wyswietl_pojazdy");
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
    
    @FXML private Label lb_nazwa_tag;
    @FXML private Label lb_nazwa2_tag;
    @FXML private Label lb_identyfikator_tag;
    @FXML private Label identyfikator;
    @FXML private Label lb_nazwa;
    @FXML private Label lb_nazwa2;
    @FXML private Label miasto;
    @FXML private Label ulica;
    @FXML private Label mieszkanie;
    @FXML private Label kod_pocztowy;
    @FXML private Label email;
    @FXML private Label nr_telefonu;
}
