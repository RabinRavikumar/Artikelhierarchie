package Artikelhierarchie;
/**
Spezialisierte Unterklasse von Möbel.
Repräsentiert ein Tisch mit einer Höhe.
**/
public class Tisch extends Moebel{
  private double hoehe; 

  public Tisch(double hoehe, String material, int artikelnummer, double preis, String produktname){
    super( material,  artikelnummer,  preis,  produktname);
    this.hoehe = hoehe;
    }
  public double getHoehe(){
    return hoehe;
    } 
  public void setHoehe(double hoehe){ 
    this.hoehe = hoehe;  
    }
  public void gibAus(){
     super.gibAus();
    System.out.println("Die Höhe beträgt " + hoehe);
    }          
    }
