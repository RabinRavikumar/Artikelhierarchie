package Artikelhierarchie;
public class Fernseher extends Artikel{
  private int bildschirmdiagonale;
  private  boolean fullHD;
  
  public Fernseher (int bildschirmdiagonale, boolean fullHD, double preis, int artikelnummer, String produktname){
    super(artikelnummer, preis, produktname);
    this.bildschirmdiagonale = bildschirmdiagonale;
    this.fullHD = fullHD;
    }
  public void gibAus(){
    super.gibAus();
    System.out.println("Bildschirmdiagonale "+bildschirmdiagonale);
    System.out.println("Unterstützt HD"+fullHD);
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
  public static void main(String[]arg){
    Fernseher Phillips = new Fernseher(47,true, 300,1457,"Phillips");
    Phillips.gibAus();
    }
  }