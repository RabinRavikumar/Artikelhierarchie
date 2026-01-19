package Artikelhierarchie;
/**
Die Klasse Sofa stellt ein spezielles Möbelstück dar,
das zusätzlich eine Anzahl an Sitzgelegenheiten besitzt.
**/
public class Sofa extends Moebel{
  private int anzahlSitzGelegenheiten;
  public Sofa (int anzahlSitzGelegenheiten, String material, int artikelnummer,double preis, String produktname){
    super(material,artikelnummer,preis, produktname);
    this.anzahlSitzGelegenheiten = anzahlSitzGelegenheiten;
    }
  public int getAnzahlSitzGelegenheiten(){
    return anzahlSitzGelegenheiten;
    }  
  public void setAnzahlSitzGelegenheiten(int anzahlSitzGelegenheiten){
    this.anzahlSitzGelegenheiten = anzahlSitzGelegenheiten;
    }
  public void gibAus(){
    super.gibAus();
    System.out.println("Anzahl der Sitzgelegenheiten:"+anzahlSitzGelegenheiten);
    }
    }
