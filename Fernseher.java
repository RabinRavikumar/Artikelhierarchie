package Artikelhierarchie;
/**
Die Klasse Fernseher stellt einen speziellen Artikel dar,
der zusätzlich eine Bildschirmdiagonale und Full-HD-Unterstützung besitzt.
**/
public class Fernseher extends Artikel{
  private int bildschirmdiagonale;
  private  boolean fullHD;
  
  public Fernseher (int artikelnummer,double preis,String produktname,int bildschirmdiagonale,boolean fullHD){
    super(artikelnummer, preis, produktname);
    this.bildschirmdiagonale = bildschirmdiagonale;
    this.fullHD = fullHD;
    }

  //Gibt alle gespeicherten Informationen über den Fernseher aus.
  public void gibAus(){
    super.gibAus();
    System.out.println("Bildschirmdiagonale: "+bildschirmdiagonale+" Zoll");
    System.out.println("Unterstützt HD: "+fullHD);
    }                   
  public int getBildschirmdiagonale(){
    return bildschirmdiagonale;
    }
  public boolean getFullHD(){
    return fullHD;
    }
  public void setBildschirmdiagonale(int bildschirmdiagonale){
    this.bildschirmdiagonale = bildschirmdiagonale;
    }
  public void setFullHD (boolean fullHD){
    this.fullHD = fullHD;
    }
    }
