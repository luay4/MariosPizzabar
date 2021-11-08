package com.company;

public class Pizza {

    private int menuNR;
    private String navn;
    private String fyld;
    private int pris;

    public Pizza(int menuNR, String navn, String fyld, int pris) {
        this.menuNR = menuNR;
        this.navn = navn;
        this.fyld = fyld;
        this.pris = pris;
    }

    public int getMenuNR() {
        return menuNR;
    }

    public String getNavn() {
        return navn;
    }

    public String getFyld() {
        return fyld;
    }

    public int getPris() {
        return pris;
    }

    @Override
    public String toString() {
        return menuNR + ". " + navn + ": " + fyld + "  " + pris + " kr.";
    }
}
