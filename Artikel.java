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
    }
