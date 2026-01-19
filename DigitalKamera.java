package Artikelhierarchie;
/**
Spezialisierte Unterklasse von Artikel.
Repräsentiert eine Digitalkamera mit Auflösung und optischem Zoom.
**/
public class DigitalKamera extends Artikel{
  private double aufloesung;
  private int optischenZoom;
  
  public DigitalKamera(double aufloesung,int optischenZoom, double preis,int artikelnummer,String produktname){
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
  public static void main(String[] args){
    DigitalKamera Canon=new DigitalKamera(12.1,3,14.99,56780,"ZoomMaster 3x");
    Canon.gibAus();
    Canon.setAufloesung(16.34);
    Canon.setOptischenZoom(10);
    Canon.setArtikelnummer(354647);
    Canon.setPreis(50.99); 
    Canon.gibAus();
    }
    }

