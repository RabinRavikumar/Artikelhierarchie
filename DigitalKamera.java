package Artikelhierarchie;
/**
Spezialisierte Unterklasse von Artikel.
Repräsentiert eine Digitalkamera mit Auflösung und optischem Zoom.
**/
public class DigitalKamera extends Artikel{
  private double aufloesung;
  private int optischenZoom;
  
  public DigitalKamera(int artikelnummer,double preis,String produktname,double aufloesung,int optischenZoom){
    super(artikelnummer,preis,produktname);
    this.aufloesung=aufloesung;
    this.optischenZoom=optischenZoom;
    }

  //Gibt alle Informationen zur Digitalkamera aus.
  public void gibAus(){
    super.gibAus();
    System.out.println("Auflösung: "+ aufloesung);
    System.out.println("Optischenzoom: "+optischenZoom);
    }
  public double getAufloesung(){
    return aufloesung;
    }
  public int getOptischenZoom(){
    return optischenZoom;
    }
  public void setAufloesung(double aufloesung){
    this.aufloesung=aufloesung;  
    }
  public void setOptischenZoom(int optischenZoom){
    this.optischenZoom=optischenZoom;
    }
    }
