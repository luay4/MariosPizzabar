package com.company;

public class Ordre {

    private int PizzaID;
    private String OrdreID;
    private String afleveringsTid;
    private String note;
    private int pris;
    private String navn;

    public Ordre(int PizzaID, String afleveringsTid, String OdreID, String note){
        this.PizzaID = PizzaID;
        this.afleveringsTid = afleveringsTid;
        this.OrdreID = OdreID;
        this.note = note;
    }


    public String getOrdreID() {
        return OrdreID;
    }

    public int getPizzaID() {
        return PizzaID;
    }

    public String getNote() {
        return note;
    }

    public String getafleveringsTid() {
        return afleveringsTid;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int PizzaID) {
        if(PizzaID == 1){this.pris = 57;}
        if(PizzaID == 2){this.pris = 53;}
        if(PizzaID == 3){this.pris = 57;}
        if(PizzaID == 4){this.pris = 63;}
        if(PizzaID == 5){this.pris = 65;}
        if(PizzaID == 6){this.pris = 57;}
        if(PizzaID == 7){this.pris = 61;}
        if(PizzaID == 8){this.pris = 61;}
        if(PizzaID == 9){this.pris = 61;}
        if(PizzaID == 10){this.pris = 61;}
        if(PizzaID == 11){this.pris = 61;}
        if(PizzaID == 12){this.pris = 61;}
        if(PizzaID == 13){this.pris = 61;}
        if(PizzaID == 14){this.pris = 61;}
        if(PizzaID == 15){this.pris = 61;}
        if(PizzaID == 16){this.pris = 61;}
        if(PizzaID == 17){this.pris = 65;}
        if(PizzaID == 18){this.pris = 63;}
        if(PizzaID == 19){this.pris = 61;}
        if(PizzaID == 20){this.pris = 63;}
        if(PizzaID == 21){this.pris = 63;}
        if(PizzaID == 22){this.pris = 61;}
        if(PizzaID == 23){this.pris = 53;}
        if(PizzaID == 24){this.pris = 61;}
        if(PizzaID == 25){this.pris = 61;}
        if(PizzaID == 26){this.pris = 61;}
        if(PizzaID == 27){this.pris = 61;}
        if(PizzaID == 28){this.pris = 57;}
        if(PizzaID == 29){this.pris = 63;}
        if(PizzaID == 30){this.pris = 69;}

    }

    public void setNavn(int PizzaID) {
        if(PizzaID == 1){this.navn = "Vesuvio";}
        if(PizzaID == 2){this.navn = "Amerikaner";}
        if(PizzaID == 3){this.navn = "Cacciatore";}
        if(PizzaID == 4){this.navn = "Cabonara";}
        if(PizzaID == 5){this.navn = "Dennis";}
        if(PizzaID == 6){this.navn = "Bertil";}
        if(PizzaID == 7){this.navn = "Silvia";}
        if(PizzaID == 8){this.navn = "Victoria";}
        if(PizzaID == 9){this.navn = "Toronfo";}
        if(PizzaID == 10){this.navn = "Capricciosa";}
        if(PizzaID == 11){this.navn = "Hawai";}
        if(PizzaID == 12){this.navn = "Le_Blissola";}
        if(PizzaID == 13){this.navn = "Venezia";}
        if(PizzaID == 14){this.navn = "Mafia";}
        if(PizzaID == 15){this.navn = "Salat_Pizza";}
        if(PizzaID == 16){this.navn = "Marco_Polo";}
        if(PizzaID == 17){this.navn = "Charlie";}
        if(PizzaID == 18){this.navn = "Mexicano";}
        if(PizzaID == 19){this.navn = "Roma";}
        if(PizzaID == 20){this.navn = "Neptun";}
        if(PizzaID == 21){this.navn = "Pratt";}
        if(PizzaID == 22){this.navn = "Chicken";}
        if(PizzaID == 23){this.navn = "Margherita";}
        if(PizzaID == 24){this.navn = "Yankee";}
        if(PizzaID == 25){this.navn = "Sicily";}
        if(PizzaID == 26){this.navn = "DK";}
        if(PizzaID == 27){this.navn = "Vegetariana";}
        if(PizzaID == 28){this.navn = "Bodil";}
        if(PizzaID == 29){this.navn = "Bowser";}
        if(PizzaID == 30){this.navn = "Mamma_Mia";}
    }

    public String getNavn() {
        return navn;
    }

    @Override
    public String toString() {
        return "Ordre{" +
                "PizzaID=" + PizzaID +
                ", OdreID='" + OrdreID + '\'' +
                ", afleveringsTid='" + afleveringsTid + '\'' +
                ", note='" + note + '\'' +
                ", pris=" + pris +
                ", navn='" + navn + '\'' +
                '}';
    }
}
