package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;


public class OrdreHandler {
    private ArrayList<Ordre> ufærdigeOrdrer = new ArrayList<>();
    private ArrayList<Ordre> færdigeOrdrer = new ArrayList<>();
    private Random random = new Random();
    private Menu menu = new Menu();

    public void visKø() {
        for (Ordre ordre : ufærdigeOrdrer) {
            System.out.println(ordre);
        }
    }

    public Ordre tilføjOrdre(ArrayList<Integer> pizzaNumre, String afleveringstid, String note) {
        ArrayList<Pizza> pizzaListe = new ArrayList<>();

        for (Integer pizzaNummer : pizzaNumre) {
            pizzaListe.add(menu.pizzaMenu.get(pizzaNummer - 1));
        }

        int ordreID = random.nextInt(1000) + 1;

        Ordre ordre = new Ordre(pizzaListe, ordreID, afleveringstid, note);

        ufærdigeOrdrer.add(ordre);
        return ordre;
    }

    public boolean sælgOrdre(int OrdreID) {
        for (int i = 0; i < ufærdigeOrdrer.size(); i++) {
            if (ufærdigeOrdrer.get(i).getOrdreID() == OrdreID) {
                færdigeOrdrer.add(ufærdigeOrdrer.get(i));
                ufærdigeOrdrer.remove(i);
                return true;
            }
        }
        return false;

    }

    public boolean sletOrdre(int OrdreID) {
        for (int i = 0; i < ufærdigeOrdrer.size(); i++) {
            if (ufærdigeOrdrer.get(i).getOrdreID() == OrdreID)
                ufærdigeOrdrer.remove(i);
            return true;
        }
        return false;
    }

    public void gemTilFil() throws FileNotFoundException {
        File file = new File("ordrehistorik.txt");
        PrintStream ps = new PrintStream(new FileOutputStream(file, true));

        for (Ordre ordre : færdigeOrdrer) {
            ps.println(ordre);
        }

    }

    public String menu() {
        return menu.udskrivMenu();
    }
}
