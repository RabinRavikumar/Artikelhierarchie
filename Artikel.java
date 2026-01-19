package Artikelhierarchie;
/**
Basisklasse für alle Artikel im Sortiment.
Enthält gemeinsame Eigenschaften wie Artikelnummer, Preis und Produktname.
**/
public class Artikel{
  private int artikelnummer;
  private double preis;
  private String produktname;
  
  public Artikel(int artikelnummer, double preis,String produktname){
    this.artikelnummer = artikelnummer;
    this.preis = preis;
    this.produktname = produktname;
    }
  public int getArtikelnummer(){
    return artikelnummer;
    }
  public void setArtikelnummer(int artikelnummer){
    this.artikelnummer = artikelnummer;
    }
  public double getPreis(){
    return preis;
    }
  public void setPreis(double preis){
    this.preis = preis;
    }
  public String getProduktname(){
    return produktname;
    }
  public void setProduktname(String produktname){
    this.produktname = produktname;
    }
  
  //Gibt den Artikel mit seinen wichtigsten Eigenschaften auf der Konsole aus.
  public void gibAus(){
    System.out.println("Der Artikel " + produktname + " mit der Artikelnummer "+ artikelnummer + " kostet "+ preis + "€.");
    }
  public static void main(String[]args){
    Artikel Test = new Artikel(12335,5.55,"Apfel");
    Test.gibAus();
    Test.setArtikelnummer(54738);
    Test.setPreis(2.95);
    Test.setProduktname("Grüner Apfel");
    Test.gibAus();
    DigitalKamera pixelpro = new DigitalKamera(12.1,3,14.99,56780,"ZoomMaster 3x");
    pixelpro.gibAus();
    DVDplayer test1 = new DVDplayer(4160,12.00, "Player2800", "HDMI", true);
    test1.gibAus();
    Fernseher Phillips = new Fernseher(47,true, 300,1457,"Phillips");
    Phillips.gibAus(); 
    }
    }

