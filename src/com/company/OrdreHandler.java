package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;


public class OrdreHandler {
    private ArrayList<Ordre> kø = new ArrayList<>();
    private ArrayList<Ordre> ordreliste = new ArrayList<>();
    private int konto = 0;
    private Random random = new Random();
    private OrdreDatabase odb;



    public void visKø() {
        for (int i = 0; i < kø.size(); i++) {
            System.out.println("OdreID: " + kø.get(i).getOdreID() + "\nPizzaID: " + kø.get(i).getPizzaID() + "\nAfleveringstid: " + kø.get(i).getafleveringsTid() + "\nNote: " + kø.get(i).getNote() + "\n");
        }
    }


    public void tilføjOrdre(int PizzaID, String afleveringTid, String note){
        String OdreID = "pizza "+PizzaID+" "+random.nextInt(10)+random.nextInt(10)+random.nextInt(10);
        Ordre odre = new Ordre(PizzaID, afleveringTid, OdreID, note);
        odre.setPris(PizzaID);
        odre.setNavn(PizzaID);
        kø.add(odre);
        ordreliste.add(odre);
        System.out.println(OdreID+" er nu tilføjet\n" +
                            "PizzaID: "+PizzaID+"\n" +
                            "Pizza navn: "+odre.getNavn()+"\n" +
                            "Note: "+note+"\nAfleveringstid: "+afleveringTid);
    }



    public boolean sælgPizza(String OdreID){
        for (int i = 0; i < kø.size(); i++){
            if (kø.get(i).getOdreID().equals(OdreID))
                konto = konto + kø.get(i).getPris();
            ordreliste.add(kø.get(i));
            kø.remove(i);
            return true;
        }
        return false;

    }
    public boolean sletPizza(String OdreID){
        for (int i = 0; i < kø.size(); i++){
            if (kø.get(i).getOdreID().equals(OdreID))
                kø.remove(i);
            return true;
        }
        return false;
    }

    public int getKonto() {
        return konto;
    }

    public void gemTilFil() throws FileNotFoundException {
        File file = new File("ordrehistorik.txt");
        PrintStream ps = new PrintStream(new FileOutputStream(file, true));

        for (Ordre ordre : ordreliste) {
            ps.println(ordre);
        }

    }
}
