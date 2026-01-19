package Artikelhierarchie;
/**
Spezialisierte Unterklasse von Möbel.
Repräsentiert ein Schrank mit einer Anzahl an Schubladen.
**/
public class Schrank extends Moebel{
  private int anzahlSchubladen;
  
  public Schrank (int anzahlSchubladen, String material, int artikelnummer,double preis,String produktname){
    super(material,artikelnummer,preis,produktname);
    this.anzahlSchubladen = anzahlSchubladen;
    }
  public int getAnzahlSchubladen(){
    return anzahlSchubladen;
    }
  public void setAnzahlSchubladen(int anzahlSchubladen){
    this.anzahlSchubladen = anzahlSchubladen;
    }
  public void gibAus(){
    super.gibAus();
    System.out.println("Anzahl Schubladen:" + anzahlSchubladen);
    }  
    }
