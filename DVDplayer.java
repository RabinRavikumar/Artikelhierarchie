package Artikelhierarchie;
/**
Repräsentiert einen DVD-Player als spezialisierte Unterklasse von Artikel.
Enthält zusätzliche Eigenschaften wie Anschlussart und Rekorderfunktion.
**/
public class DVDplayer extends Artikel{
  private String anschluss;
  private boolean rekorderfunktion;
  
  public DVDplayer(int artikelnummer, double preis, String produktname, String anschluss, boolean rekorderfunktion){
    super(artikelnummer, preis, produktname);
    this.anschluss = anschluss;
    this.rekorderfunktion = rekorderfunktion;
    }
  public String getAnschluss(){
    return anschluss;
    }
  public boolean getRekorderfunktion(){
    return rekorderfunktion;
    }
  public void setAnschluss (String pAnschluss){
    anschluss = pAnschluss;
    }
  public void setRekorderfunktion(boolean rekorderfunktion){
    this.rekorderfunktion = rekorderfunktion;
    }
  
  //Gibt alle Informationen zum DVD-Player aus.
  public void gibAus(){
    super.gibAus();
    System.out.println("Anschluss: " + anschluss);
    if (rekorderfunktion == true){
       System.out.println("Rekorderfunktion vorhanden");
       } // end of if
    }
    }
