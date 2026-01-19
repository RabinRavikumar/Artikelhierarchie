package Artikelhierarchie;
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
  public static void main(String[]arg){
    Schrank test1 = new Schrank(10,"Holz",12345, 150.30,"Super3xl");
    test1.gibAus();
    }  
    }
