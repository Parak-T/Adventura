package com.company;

import com.company.akce.Akce;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TIBOR on 1.2.2016.
 */
public class Lokace {

    public List povoleneAkce;

    private List predmety;

    public Lokace(List akce) {
        this(akce, new ArrayList<>());
    }

    public Lokace(List akce, List predmety) {
        this.povoleneAkce = akce;
        this.predmety = predmety;
    }

    public boolean jdeProvest(String akce) {

        return povoleneAkce.contains(akce);
    }

    public boolean muzuVzit(String predmet) {
        return predmety.contains(predmet);
    }
public void odeberPredmet (String predmet){
    predmety.remove (predmet);
}
}
