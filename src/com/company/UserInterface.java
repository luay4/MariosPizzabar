package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {

    Scanner input = new Scanner(System.in);
    String choice;
    OrdreHandler ordreHandler = new OrdreHandler();

    public void start() throws FileNotFoundException {


        boolean runProgram = true;
        System.out.println("Velkommen til Marios Pizza App Version 1.0");
        System.out.println("""
                Tast følgende for forskellige funktioner:
                'menu', 'm' for at se menuen over pizzaerne
                'ny', 'n' for at lave en ny bestilling på en pizza
                'f', 'færdig' for at færdigøre bestillingen
                's', 'slet' for at slette bestillingen'k', 'kø' for at se de ufærdige bestillinger
                'k', 'kø' for at se alle ufærdige bestillinger
                'x', 'afslut' for at afslutte programmet""");

        while (runProgram) {
            System.out.print("Indtast en kommando: ");
            choice = input.next().toLowerCase();
            System.out.println();
            switch (choice) {
                case "menu", "m":
                    System.out.println(ordreHandler.menu());
                    break;
                case "n", "ny":
                    nyPizza();
                    break;
                case "f", "færdig":
                    færdigOrdre();
                    break;
                case "s", "slet":
                    sletOrdre();
                    break;
                case "k", "kø":
                    System.out.println("Ufærdige ordrer:");
                    ordreHandler.visKø();
                    break;
                case "x", "afslut":
                    ordreHandler.gemTilFil();
                    System.out.println("Ordrerne for i dag er blevet gemt - hav en god dag!");
                    runProgram = false;
                    break;
                default:
                    System.out.println("Kunne ikke forstå denne kommando");
                    break;
            }
        }
    }


    public void nyPizza() {
        System.out.println("For at stoppe indtastningen af flere pizzaer tast 0");
        ArrayList<Integer> pizzanumre = new ArrayList<>();
        int pizzanummer = 1;
        while (pizzanummer >= 1 && pizzanummer <= 30) {
            System.out.print("Indtast pizzaens menunummer: ");
            pizzanummer = input.nextInt();
            if (pizzanummer >= 1 && pizzanummer <= 30) {
                pizzanumre.add(pizzanummer);
            } else {
                break;
            }
        }
        System.out.print("Indtast afleveringstidspunkt: ");
        String afleveringTid = input.next();
        System.out.print("Indtast note: ");
        String note = input.next();
        Ordre finalOrder = ordreHandler.tilføjOrdre(pizzanumre, afleveringTid, note);
        System.out.println("Ordre " + finalOrder.getOrdreID() + " er føjet til listen af ordre");
        System.out.println();
    }

    public void færdigOrdre() {
        ordreHandler.visKø();
        System.out.print("Indtast ordreID for at færdiggøre ordre: ");
        int ordreIDF = input.nextInt();
        boolean ordreF = ordreHandler.sælgOrdre(ordreIDF);
        if (ordreF) {
            System.out.println(ordreIDF + " blev solgt og slettet i køen");
        } else {
            System.out.println("Prøv igen");
        }
    }

    public void sletOrdre() {
        ordreHandler.visKø();
        System.out.print("Indtast ordreID for at slette ordre: ");
        int ordreIDS = input.nextInt();
        boolean ordreS = ordreHandler.sletOrdre(ordreIDS);
        if (ordreS) {
            System.out.println(ordreIDS + " blev slettet i køen");
        } else {
            System.out.println("Prøv igen");
        }
    }
}

