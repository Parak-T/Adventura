package com.company.akce;

import com.company.Inventar;
import com.company.Lokace;
import com.company.Mapa;
import com.company.Pozice;

/**
 * Created by TIBOR on 20.3.2016.
 */
public class Zvedni extends Akce {

    Mapa mapa;
    Inventar inventar;

    public Zvedni(Mapa mapa, Inventar inventar) {
        super("zvedni", 1);
        this.mapa = mapa;
        this.inventar = inventar;
    }

    public void proved(String[] parametry) {
        Lokace aktualniLokace = mapa.getAktualniLokace();
        if (aktualniLokace.jdeProvest(getPrikaz()) && aktualniLokace.muzuVzit(parametry[1])) {
            inventar.pridat(parametry[1]);
            aktualniLokace.odeberPredmet(parametry[1]);
            inventar.vypis();
        } else {
            System.out.println("Kde nic, tu nic.");
        }
    }

}
