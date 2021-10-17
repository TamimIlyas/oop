
public class Artikel {
     String bezeichnung = "Vulkan Magic Light";
     double preis;
    int dauer;

    public Artikel(String bezeichnung, double preis, int dauer) {
        if (preis < 0){
            System.out.println("Fehler: " + "Artikel.preis ung¨ultig:" + preis);
            System.out.println(1);
        }
        this.bezeichnung = bezeichnung;
        this.preis = preis;
        this.dauer = dauer;
    }

    public Artikel() {

    }
    public String getBezeichnung (){
        return bezeichnung;
    }
     int getDauer(){
        return dauer;
    }
    double getPreis(){
        return preis;
    }
}

