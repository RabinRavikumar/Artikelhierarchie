package Artikelhierarchie;
public class Moebel extends Artikel
{
  private String material;
  
  public Moebel (String material, int artikelnummer, double preis,  String produktname)
  {
    super(artikelnummer,preis,produktname);
    this.material= material;
    }

  public String getMaterial()
  {
    return material;
    }

  public void  setMaterial (String material)
  {
    this.material= material;
    }
    
  public void gibAus()
  {
    System.out.println("Das Möbelstück besteht aus "+material);
    System.out.println("-----------------------------------");
    super.gibAus();
      }  
   
  public static void main(String[]arg) {
    Moebel Joop = new Moebel("Holz", 25334, 1000, "Schreibtisch");
    
    Joop.gibAus();
  }
  }