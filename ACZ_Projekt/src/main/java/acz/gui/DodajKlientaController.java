package acz.gui;

import acz.model.Adres;
import acz.model.Klienci.Firma;
import acz.model.Klienci.Klient;
import acz.model.Klienci.OsobaPrywatna;
import acz.model.Kontakt;
import java.awt.Color;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;

public class DodajKlientaController 
{
    @FXML
    public void initialize()
    {
        rb_os_prywatna.setSelected(true);
    }

    @FXML
    private void goToMainWindow() throws IOException
    {
        Window.setRoot("main");
    }

    @FXML
    private void dodaj() throws IOException
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
        
        boolean dodano = false;
        
        Adres tmp_adres = new Adres(str_miasto, str_ulica, str_mieszkanie, str_kod_pocztowy);
        Kontakt tmp_kontakt = new Kontakt(str_email, str_nr_telefonu);
                
        if(rb_os_prywatna.isSelected())
        {
            dodano = Main.manager_klientow.register(new OsobaPrywatna(tmp_adres, tmp_kontakt, str_imie, str_nazwisko, str_pesel));
        }
        else
        {
            dodano = Main.manager_klientow.register(new Firma(tmp_adres, tmp_kontakt, str_imie, str_pesel));
        }
        
        if(dodano)
        {
            lb_message.setTextFill(Paint.valueOf("#00FF00"));
            lb_message.setText("Dodano nowego klienta.");
        }
        else
        {
            lb_message.setTextFill(Paint.valueOf("#FF0000"));
            lb_message.setText("Taki klient juz istnieje.");
        }
    }
    
    @FXML
    private void rodzajKlientaRB(ActionEvent e) throws IOException
    {
        RadioButton obj = (RadioButton)e.getSource();
        
        if(rb_os_prywatna.isSelected())
            rb_os_prywatna.setSelected(false);
        
        if(rb_firma.isSelected())
            rb_firma.setSelected(false);
        
        obj.setSelected(true);
        
        if(rb_os_prywatna.isSelected())
        {
            lb_imie.setText("Imie");
            lb_pesel.setText("PESEL");
            lb_nazwisko.setDisable(false);
            nazwisko.setDisable(false);
        }
        else
        {
            lb_imie.setText("Nazwa");
            lb_pesel.setText("NIP");
            lb_nazwisko.setDisable(true);
            nazwisko.setDisable(true);
        }
    }
    
    @FXML
    private void switchToDodajPojazdWindow() throws IOException 
    {
        Window.setRoot("dodaj_pojazd");
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
