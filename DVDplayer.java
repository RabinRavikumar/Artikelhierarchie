package Artikelhierarchie;
public class DVDplayer extends Artikel{
  private String anschluss;
  private boolean rekorderfunktion;
  
  public DVDplayer(int artikelnummer, double preis, String produktname, String anschluss, boolean rekorderfunktion){
    super(artikelnummer, preis, produktname);
    this.anschluss = anschluss;
    this.rekorderfunktion = rekorderfunktion;
    }
  public String getAnschluss(){
    return anschluss;
    }
  public boolean getRekorderfunktion(){
    return rekorderfunktion;
    }
  public void setAnschluss (String pAnschluss){
    anschluss = pAnschluss;
    }
  public void gibAus(){
    super.gibAus();
    System.out.println("Anschluss: " + anschluss);
    if (rekorderfunktion == true){
       System.out.println("Rekorderfunktion vorhanden");
    } // end of if
    }
  public static void main(String[]arg){
    DVDplayer test1 = new DVDplayer(4160,12.00, "Player2800", "HDMI", true);
    test1.gibAus();
    }
    }
