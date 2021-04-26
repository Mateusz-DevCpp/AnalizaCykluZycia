package acz.gui;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class DodajPojazdController 
{
    @FXML Pane main_pane;
    
    @FXML TextField moc;
    @FXML TextField zuzycie_paliwa;
    @FXML TextField przebieg;
    
    @FXML TextField cena;
    @FXML TextField nr_rejestracyjny;
    @FXML TextField waga;
    
    @FXML RadioButton rb_osobowka;
    @FXML RadioButton rb_transportowy;
    @FXML RadioButton rb_motor;
    @FXML RadioButton rb_rower;
    
    @FXML RadioButton rb_n_mechaniczny;
    @FXML RadioButton rb_n_fizyczny;
    
    @FXML
    public void initialize()
    {
        rb_osobowka.setSelected(true);
        rb_n_mechaniczny.setSelected(true);
    }
    
    @FXML
    private void dodaj() throws IOException 
    {
        String str_moc = moc.getText();
        String str_zuzycie_plaiwa = zuzycie_paliwa.getText();
        String str_przebieg = przebieg.getText();
        String str_cena = cena.getText();
        String str_nr_rejestracyjny = nr_rejestracyjny.getText();
        String str_waga = waga.getText();
        
        if(rb_n_mechaniczny.isSelected())
        {
            if(str_moc.length() == 0)return;
            if(str_zuzycie_plaiwa.length() == 0)return;
            if(str_przebieg.length() == 0)return;
        }
        
        if(str_cena.length() == 0)return;
        if(str_nr_rejestracyjny.length() == 0)return;
        if(str_waga.length() == 0)return;
        
        System.out.println("acz.gui.DodajPojazdController.dodaj()");
    }
   
    @FXML
    private void goToMainWindow() throws IOException
    {
        Window.setRoot("main");
    }
    
    @FXML
    private void typPojazduRB(ActionEvent e) throws IOException
    {
        RadioButton obj = (RadioButton)e.getSource();
        
        if(rb_osobowka.isSelected())
            rb_osobowka.setSelected(false);
        
        if(rb_transportowy.isSelected())
            rb_transportowy.setSelected(false);
        
        if(rb_motor.isSelected())
            rb_motor.setSelected(false);
        
        if(rb_rower.isSelected())
            rb_rower.setSelected(false);
        
        obj.setSelected(true);
    }
    
    @FXML
    private void typNapeduRB(ActionEvent e) throws IOException
    {
        RadioButton obj = (RadioButton)e.getSource();
        
        if(rb_n_fizyczny.isSelected())
            rb_n_fizyczny.setSelected(false);
        
        if(rb_n_mechaniczny.isSelected())
            rb_n_mechaniczny.setSelected(false);
        
        obj.setSelected(true);
        
        if(rb_n_fizyczny.isSelected())
        {    
            moc.setDisable(true);
            zuzycie_paliwa.setDisable(true);
            przebieg.setDisable(true);
        }
        else
        {
            moc.setDisable(false);
            zuzycie_paliwa.setDisable(false);
            przebieg.setDisable(false);
        }
    }
}