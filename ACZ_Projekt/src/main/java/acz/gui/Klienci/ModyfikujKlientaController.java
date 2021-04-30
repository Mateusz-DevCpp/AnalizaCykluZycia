package acz.gui.Klienci;

import acz.gui.Main;
import acz.gui.Window;
import acz.model.Klienci.OsobaPrywatna;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;

public class ModyfikujKlientaController 
{
    @FXML
    public void initialize()
    {
        if(Main.wybrany_klient.getType() == (new OsobaPrywatna(null,null,null,null,null)).getType())
        {
            rb_os_prywatna.setSelected(true);
        }
        else
        {
            rb_firma.setSelected(true);
            lb_imie.setText("Nazwa");
            lb_nazwisko.setText("");
            lb_nazwisko.setDisable(true);
            nazwisko.setDisable(true);
        }
        
        miasto.setText(Main.wybrany_klient.getAdres().getMiasto());
        ulica.setText(Main.wybrany_klient.getAdres().getUlica());
        mieszkanie.setText(Main.wybrany_klient.getAdres().getMieszkanie());
        kod_pocztowy.setText(Main.wybrany_klient.getAdres().getKodPocztowy());
        email.setText(Main.wybrany_klient.getKontakt().getEmail());
        nr_telefonu.setText(Main.wybrany_klient.getKontakt().getNrTelefonu());
        imie.setText(Main.wybrany_klient.getNazwa());
        nazwisko.setText(Main.wybrany_klient.getNazwa2());
        pesel.setText(Main.wybrany_klient.getID());
    }
    
    @FXML
    private void modyfikuj() throws IOException
    {
        String str_miasto = miasto.getText();
        String str_ulica = ulica.getText();
        String str_mieszkanie = mieszkanie.getText();
        String str_kod_pocztowy = kod_pocztowy.getText();
        String str_email = email.getText();
        String str_nr_telefonu = nr_telefonu.getText();
        String str_imie = imie.getText();
        String str_nazwisko = nazwisko.getText();
        String str_pesel = pesel.getText();
        
        boolean poprawne_dane = true;
        
        if(str_miasto.length() == 0)poprawne_dane = false;
        if(str_ulica.length() == 0)poprawne_dane = false;
        if(str_mieszkanie.length() == 0)poprawne_dane = false;
        if(str_kod_pocztowy.length() == 0)poprawne_dane = false;
        if(str_email.length() == 0)poprawne_dane = false;
        if(str_nr_telefonu.length() == 0)poprawne_dane = false;
        if(rb_os_prywatna.isSelected())
        {
            if(str_nazwisko.length() == 0)poprawne_dane = false;
        }
        if(str_imie.length() == 0)poprawne_dane = false;
        if(str_pesel.length() == 0)poprawne_dane = false;
        
        if(!poprawne_dane)
        {
            lb_message.setTextFill(Paint.valueOf("#FF0000"));
            lb_message.setText("Wprowadzone dane sa bledne.");
            return;
        }
        
        Main.wybrany_klient.getAdres().setMiasto(str_miasto);
        Main.wybrany_klient.getAdres().setUlica(str_ulica);
        Main.wybrany_klient.getAdres().setMieszkanie(str_mieszkanie);
        Main.wybrany_klient.getAdres().setKodPocztowy(str_kod_pocztowy);
        
        Main.wybrany_klient.getKontakt().setEmail(str_email);
        Main.wybrany_klient.getKontakt().setNrTelefonu(str_nr_telefonu);
        
        Main.wybrany_klient.setNazwa(str_imie);
        Main.wybrany_klient.setNazwa2(str_nazwisko);
        Main.wybrany_klient.setID(str_pesel);
            
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
    
    @FXML RadioButton rb_os_prywatna;
    @FXML RadioButton rb_firma;
    
    @FXML Label lb_imie;
    @FXML Label lb_nazwisko;
    @FXML Label lb_pesel;
    
    @FXML TextField miasto;
    @FXML TextField ulica;
    @FXML TextField mieszkanie;
    @FXML TextField kod_pocztowy;
    @FXML TextField email;
    @FXML TextField nr_telefonu;
    @FXML TextField imie;
    @FXML TextField nazwisko;
    @FXML TextField pesel;
}
