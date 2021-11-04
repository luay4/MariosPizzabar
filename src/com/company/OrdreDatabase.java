package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class OrdreDatabase {

    public ArrayList<Ordre> ordreliste = new ArrayList<>();



    public void gemFil() throws FileNotFoundException {
        File file = new File("ordrehistorik.txt");
        PrintStream ps = new PrintStream(new FileOutputStream(file, true));

        for (Ordre ordre : ordreliste) {
            ps.println(ordre);
        }

        System.out.println("Ordrerne for i dag er blevet gemt - hav en god dag!");
    }

}
