package com.company;

import java.util.ArrayList;

public class Ordre {

    private ArrayList<Pizza> pizzaer = new ArrayList<>();
    private int ordreID;
    private String afleveringsTid;
    private String note;


    public Ordre(ArrayList<Pizza> pizzaer, int ordreID, String afleveringsTid, String note) {
        this.pizzaer = pizzaer;
        this.ordreID = ordreID;
        this.afleveringsTid = afleveringsTid;
        this.note = note;
    }


    public int getOrdreID() {
        return ordreID;
    }


    public ArrayList<Pizza> getPizzaer() {
        return pizzaer;
    }

    public String getNote() {
        return note;
    }

    public String getafleveringsTid() {
        return afleveringsTid;
    }

    @Override
    public String toString() {
        String pizzaerne = "";
        for (Pizza pizza : pizzaer) {
            pizzaerne += pizza.getNavn() + "  ";
        }
        return "Ordre " + ordreID + " Pizza(er): " + pizzaerne + "Afleveringstid: " + afleveringsTid + "  Note: " + note;
    }

}
