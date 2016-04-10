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

    private Bytost bytost;

    public Lokace(List akce) {
        this(akce, new ArrayList<>());
    }

    public Lokace(List akce, List predmety) {
        this(akce, null, predmety);

    }

    public Lokace(List akce, Bytost bytost) {
        this(akce, bytost, null);

    }

    public Lokace(List akce, Bytost bytost, List predmety) {
        this.povoleneAkce = akce;
        this.bytost = bytost;
        this.predmety = predmety;
    }

    public boolean jdeProvest(String akce) {
        return povoleneAkce.contains(akce);
    }

    public boolean muzuVzit(String predmet) {
        return predmety.contains(predmet);
    }

    public void odeberPredmet(String predmet) {
        predmety.remove(predmet);
    }

    public void pridejPredmet(String predmet) {
        predmety.add(predmet);
    }

    public boolean jeBytost(String bytost) {
        return true;
    }

    public void vypis() {
        if (!predmety.isEmpty() || bytost != null) {
            System.out.println("V místnosti vidíš:");
            for (Object vec : predmety) {

                System.out.println(vec);

            }
            System.out.println(bytost);
        } else {

            System.out.println("Bmístnost je prázdná.");
        }
    }

    public Bytost getBytost() {
        return bytost;
    }
}
