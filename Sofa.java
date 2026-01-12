package Artikelhierarchie ;
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
  public static void main (String[]args){
    Sofa s1 = new Sofa (3, "3 Minecraft Wolle, 3 Holckblöcke von Badlandmanssion",017622547,1999.99,"Minecraft Kuschelstuhl-2000-New/Gen");
    s1.gibAus();
    
    System.out.println("Die anzahl derSitzgelegenheiten beträgt:");
    s1.getAnzahlSitzGelegenheiten();
    System.out.println(s1.getAnzahlSitzGelegenheiten());
    s1.getAnzahlSitzGelegenheiten();
    
    
    
    
    }
  }