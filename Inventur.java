package Artikelhierarchie;
/**
Verwaltet ein Sortiment aus Artikeln und ermöglicht das Ausgeben
und Ersetzen einzelner Elemente.
**/
public class Inventur{
  private Artikel[] sortiment;
  
  public Inventur(Artikel[] sortiment){
    this.sortiment = sortiment;
    }

  //Gibt alle Artikel im Sortiment aus.
  public void gibAus(){
    for (int i = 0; i < sortiment.length; i++){
      sortiment[i].gibAus();
      } // end of for  
    }
  //Gibt einen einzelnen Artikel an der angegebenen Position aus.
  public void gibAus(int zahl){
    sortiment[zahl].gibAus();
    }
  public void setArtikel(Artikel angebot,int zahl){
    sortiment[zahl]= angebot;
    }
  public Artikel getArtikel(int zahl){
    return sortiment[zahl];
    }
    }
