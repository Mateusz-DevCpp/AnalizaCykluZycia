package acz.gui;

import acz.model.Napedy.Fizyczny;
import acz.model.Napedy.Mechaniczny;
import acz.model.Napedy.Naped;
import acz.model.Pojazdy.Motor;
import acz.model.Pojazdy.Osobowy;
import acz.model.Pojazdy.Pojazd;
import acz.model.Pojazdy.Rower;
import acz.model.Pojazdy.Transportowy;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;

public class DodajPojazdController 
{
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
        String str_ilosc_miejsc = ilosc_miejsc.getText();
        String str_max_udzwig = max_udzwig.getText();
        
        boolean poprawne_dane = true;
        
        if(rb_n_mechaniczny.isSelected())
        {
            if(str_moc.length() == 0)poprawne_dane = false;
            if(str_zuzycie_plaiwa.length() == 0)poprawne_dane = false;
            if(str_przebieg.length() == 0)poprawne_dane = false;
        }
        
        if(str_cena.length() == 0)poprawne_dane = false;
        if(str_nr_rejestracyjny.length() == 0)poprawne_dane = false;
        if(str_waga.length() == 0)poprawne_dane = false;
        
        if(rb_transportowy.isSelected())
        {
            if(str_ilosc_miejsc.length() == 0)poprawne_dane = false;
            if(str_max_udzwig.length() == 0)poprawne_dane = false;
        }
        else if(rb_osobowka.isSelected())
        {
            if(str_ilosc_miejsc.length() == 0)poprawne_dane = false;
        }
        
        if(!poprawne_dane)
        {
            lb_message.setTextFill(Paint.valueOf("#FF0000"));
            lb_message.setText("Wprowadzone dane sa bledne.");
            return;
        }
        
        boolean dodano = false;
        
        Naped naped;
        if(rb_n_mechaniczny.isSelected())
        {
            naped = new Mechaniczny(Float.parseFloat(str_moc), Float.parseFloat(str_zuzycie_plaiwa), Integer.parseInt(str_przebieg));
        }
        else
        {
            naped = new Fizyczny();
        }
        
        Pojazd newObj;
        if(rb_osobowka.isSelected())
        {
            newObj = new Osobowy(naped, str_nr_rejestracyjny, Float.parseFloat(str_cena), Float.parseFloat(str_waga), Integer.parseInt(str_ilosc_miejsc));
        }
        else if(rb_transportowy.isSelected())
        {
            newObj = new Transportowy(naped, str_nr_rejestracyjny, Float.parseFloat(str_cena), Float.parseFloat(str_waga), Integer.parseInt(str_ilosc_miejsc), Integer.parseInt(str_max_udzwig));
        }
        else if(rb_motor.isSelected())
        {
            newObj = new Motor(naped, str_nr_rejestracyjny, Float.parseFloat(str_cena), Float.parseFloat(str_waga));
        }
        else
        {
            newObj = new Rower(naped, str_nr_rejestracyjny, Float.parseFloat(str_cena), Float.parseFloat(str_waga));
        }
        
        dodano = Main.manager_pojazdow.register(newObj);
        
        if(dodano)
        {
            lb_message.setTextFill(Paint.valueOf("#00FF00"));
            lb_message.setText("Dodano nowy pojazd.");
        }
        else
        {
            lb_message.setTextFill(Paint.valueOf("#FF0000"));
            lb_message.setText("Taki pojazd juz istnieje.");
        }
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
        
        if(rb_motor.isSelected() || rb_rower.isSelected())
        {    
            ilosc_miejsc.setDisable(true);
            lb_ilosc_miejsc.setDisable(true);
            max_udzwig.setDisable(true);
            lb_max_udzwig.setDisable(true);
        }
        else if(rb_osobowka.isSelected())
        {
            ilosc_miejsc.setDisable(false);
            lb_ilosc_miejsc.setDisable(false);
            max_udzwig.setDisable(true);
            lb_max_udzwig.setDisable(true);
        }
        else if(rb_transportowy.isSelected())
        {
            ilosc_miejsc.setDisable(false);
            lb_ilosc_miejsc.setDisable(false);
            max_udzwig.setDisable(false);
            lb_max_udzwig.setDisable(false);
        }
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
            lb_moc.setDisable(true);
            zuzycie_paliwa.setDisable(true);
            lb_zuzycie_paliwa.setDisable(true);
            przebieg.setDisable(true);
            lb_przebieg.setDisable(true);
        }
        else
        {
            moc.setDisable(false);
            lb_moc.setDisable(false);
            zuzycie_paliwa.setDisable(false);
            lb_zuzycie_paliwa.setDisable(false);
            przebieg.setDisable(false);
            lb_przebieg.setDisable(false);
        }
    }
    
    @FXML
    private void goToMainWindow() throws IOException
    {
        Window.setRoot("main");
    }
    
    @FXML
    private void switchToDodajKlientaWindow() throws IOException 
    {
        Window.setRoot("dodaj_klienta");
    }
    
    ///-------------------------------------------------------------------------
    
    @FXML Pane main_pane;
    
    @FXML Label lb_message;
    
    @FXML Label lb_moc;
    @FXML Label lb_zuzycie_paliwa;
    @FXML Label lb_przebieg;
    @FXML Label lb_ilosc_miejsc;
    @FXML Label lb_max_udzwig;
    
    @FXML TextField moc;
    @FXML TextField zuzycie_paliwa;
    @FXML TextField przebieg;
    
    @FXML TextField cena;
    @FXML TextField nr_rejestracyjny;
    @FXML TextField waga;
    
    @FXML TextField ilosc_miejsc;
    @FXML TextField max_udzwig;
    
    @FXML RadioButton rb_osobowka;
    @FXML RadioButton rb_transportowy;
    @FXML RadioButton rb_motor;
    @FXML RadioButton rb_rower;
    
    @FXML RadioButton rb_n_mechaniczny;
    @FXML RadioButton rb_n_fizyczny;
    
}