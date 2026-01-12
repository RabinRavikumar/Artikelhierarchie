package Artikelhierarchie;
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
  public void gibAngebotAus(){
    angebot1.gibAus();
    angebot2.gibAus();
    angebot3.gibAus();  
    }
  public static void main(String[]args) {
    Artikel artikel1 = new Fernseher(47,true, 300,1457,"Phillips");
    artikel1.gibAus();
    Artikel artikel2 = new DVDplayer(4160,12.00, "Player2800", "HDMI", true);
    Artikel artikel3=new DigitalKamera(12.1,3,14.99,56780,"ZoomMaster 3x");
    Angebote a1 = new Angebote(artikel1,artikel2,artikel3);
    a1.gibAngebotAus();  
    }
  }