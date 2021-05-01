package acz.gui.Pojazdy;

import acz.gui.Main;
import acz.gui.Window;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;

public class SzczegolyPojazduController 
{
    @FXML Label lb_stan;
    @FXML Label lb_typ_pojazdu;
    @FXML Label lb_id;
    @FXML Label lb_cena;
    @FXML Label lb_naped_typ;
    @FXML Label lb_moc_tag;
    @FXML Label lb_moc;
    @FXML Label lb_zuzycie_paliwa_tag;
    @FXML Label lb_zuzycie_paliwa;
    @FXML Label lb_przebieg_tag;
    @FXML Label lb_przebieg;
    @FXML Label lb_waga;
    @FXML Label lb_ilosc_miejsc;
    @FXML Label lb_max_udzwig_tag;
    @FXML Label lb_max_udzwig;
    
    @FXML
    public void initialize() 
    {
        lb_max_udzwig_tag.setVisible(false);
        lb_max_udzwig.setVisible(false);
        
        if(Main.wybrany_pojazd.isWypozyczony())
        {
            lb_stan.setTextFill(Paint.valueOf("#FF0000"));
            lb_stan.setText("Wypozyczony");
        }
        else
        {
            lb_stan.setTextFill(Paint.valueOf("#00FF00"));
            lb_stan.setText("Dostepny");
        }
        lb_typ_pojazdu.setText(Main.wybrany_pojazd.getType());
        lb_id.setText(Main.wybrany_pojazd.getID());
        lb_cena.setText(Float.toString(Main.wybrany_pojazd.getCena()));
        lb_naped_typ.setText(Main.wybrany_pojazd.getNaped().getType());
        if(Main.wybrany_pojazd.getNaped().getType().equals("Mechaniczny"))
        {
            lb_moc.setText(Float.toString(Main.wybrany_pojazd.getNaped().getMoc()));
            lb_zuzycie_paliwa.setText(Float.toString(Main.wybrany_pojazd.getNaped().getZuzycie_paliwa()));
            lb_przebieg.setText(Integer.toString(Main.wybrany_pojazd.getNaped().getPrzebieg()));
        }
        else
        {
            lb_moc_tag.setVisible(false);
            lb_moc.setVisible(false);
            lb_zuzycie_paliwa_tag.setVisible(false);
            lb_zuzycie_paliwa.setVisible(false);
            lb_przebieg_tag.setVisible(false);
            lb_przebieg.setVisible(false);
        }
        lb_waga.setText(Float.toString(Main.wybrany_pojazd.getWaga()));
        lb_ilosc_miejsc.setText(Integer.toString(Main.wybrany_pojazd.getIloscMiejsc()));
        if(Main.wybrany_pojazd.getType().equals("Transporter"))
        {
            lb_max_udzwig_tag.setVisible(true);
            lb_max_udzwig.setVisible(true);
            lb_max_udzwig.setText(Integer.toString(Main.wybrany_pojazd.getMaxUdzwig()));
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
    
}
