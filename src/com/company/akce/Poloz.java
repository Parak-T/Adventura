package com.company.akce;

import com.company.Inventar;
import com.company.Lokace;
import com.company.Mapa;

/**
 * Created by TIBOR on 23.3.2016.
 */
public class Poloz extends Akce {
    Mapa mapa;
    Inventar inventar;

    public Poloz (Mapa mapa, Inventar inventar) {
        super("polož", 1);
        this.mapa = mapa;
        this.inventar = inventar;
    }

    public void proved(String[] parametry) {
        Inventar predmety = inventar;
        Lokace aktualniLokace = mapa.getAktualniLokace();
        if (aktualniLokace.jdeProvest(getPrikaz()) && predmety.over(parametry[1])) {
            inventar.odeber (parametry [1]);
            aktualniLokace.pridejPredmet(parametry [1]);
            inventar.vypis ();
        }
        else {
            System.out.println("nemůžeš");
        }
    }
}
