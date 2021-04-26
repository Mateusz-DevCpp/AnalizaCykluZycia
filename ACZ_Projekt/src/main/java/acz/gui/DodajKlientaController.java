package acz.gui;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class DodajKlientaController 
{
    @FXML RadioButton rb_os_prywatna;
    @FXML RadioButton rb_firma;
    
    @FXML Label lb_imie;
    @FXML Label lb_nazwisko;
    @FXML Label lb_pesel;
    
    @FXML TextField miasto;
    @FXML TextField ulica;
    @FXML TextField mieszkanie;
    @FXML TextField kod_pocztowy;
    @FXML TextField emial;
    @FXML TextField nt_telefonu;
    @FXML TextField imie;
    @FXML TextField nazwisko;
    @FXML TextField pesel;

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
}
