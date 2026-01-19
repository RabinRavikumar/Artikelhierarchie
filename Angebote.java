package Artikelhierarchie;
/**
Repräsentiert ein Angebot aus drei Artikeln.
Ermöglicht das Ausgeben aller enthaltenen Artikel.
**/
public class Angebote{
  private Artikel angebot1;
  private Artikel angebot2;
  private Artikel angebot3;
  
  public Angebote(Artikel angebot1,Artikel angebot2,Artikel angebot3){
    this.angebot1=angebot1;
    this.angebot2=angebot2;
    this.angebot3=angebot3;
    } 
  public Artikel getAngebot1(){
    return angebot1;  
    }
  public Artikel getAngebot2(){
    return angebot2;  
    }
  public Artikel getAngebot3(){
    return angebot3;  
    }
  public void setAngebot1(Artikel angebot1){
    this.angebot1=angebot1;  
    }
  public void setAngebot2(Artikel angebot2){
    this.angebot2=angebot2;  
    }
  public void setAngebot3(Artikel angebot3){
    this.angebot3=angebot3;  
    }
  
  //Gibt alle Artikel des Angebots aus.
  public void gibAngebotAus(){
    angebot1.gibAus();
    angebot2.gibAus();
    angebot3.gibAus();  
    }
    }
