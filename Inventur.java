package Artikelhierarchie;
public class Inventur{
  private Artikel[] sortiment;
  
  public Inventur(Artikel[] sortiment){
    this.sortiment = sortiment;
    }
  public void gibAus(){
    for (int i = 0; i < sortiment.length; i++){
      sortiment[i].gibAus();
      } // end of for  
    }
  public void gibAus(int zahl){
    sortiment[zahl].gibAus();
    }
  public void setArtikel(Artikel angebot,int zahl){
    sortiment[zahl]= angebot;
    }
  public Artikel getArtikel(int zahl){
    return sortiment[zahl];
    }
  public static void main(String[]args){
    Fernseher Phillips = new Fernseher(47,true, 300,1457,"Phillips");
    DigitalKamera Canon=new DigitalKamera(12.1,3,14.99,56780,"ZoomMaster 3x");
    DVDplayer test1 = new DVDplayer(4160,12.00, "Player2800", "HDMI", true);
    Artikel[] sortiment = new Artikel[3];
    sortiment[0] = Phillips;
    sortiment[1] = Canon;
    sortiment[2] = test1;
    Inventur test = new Inventur(sortiment);
    test.gibAus();
    test.gibAus(1);
    System.out.println(test.getArtikel(2));  
  }
  }

