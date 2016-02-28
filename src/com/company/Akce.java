package com.company;

/**
 * Created by TIBOR on 1.2.2016.
 */
public class Akce {
    public Akce(String příkaz, int pocetParametru) {
        this.prikaz = příkaz;
        this.pocetParametru = pocetParametru;
    }

    public String prikaz;
    public int pocetParametru;

    public boolean rozumimPrikazu(String[] parametry) {

        if (parametry[0].equals(prikaz)) {
            if (parametry.length == pocetParametru + 1) {
                return true;

            } else {
                return false;
            }
        } else {
            return false;
        }

    }

}
