package Artikelhierarchie;
//Unterklasse von Artikel, die ein Möbelstück mit dem zusätzlichen Attribut material darstellt.
public class Moebel extends Artikel{
  private String material;
  
  public Moebel (int artikelnummer,double preis,String produktname,String material){
    super(artikelnummer,preis,produktname);
    this.material= material;
    }
  public String getMaterial(){
    return material;
    }
  public void  setMaterial (String material){
    this.material= material;
    }
  public void gibAus(){
    System.out.println("Das Möbelstück besteht aus "+material);
    System.out.println("-----------------------------------");
    super.gibAus();
    }  
    }
