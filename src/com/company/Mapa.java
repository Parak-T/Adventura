package com.company;

import com.company.akce.Jdi;
import com.company.akce.Zvedni;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by TIBOR on 14.2.2016.
 */
public class Mapa {
    public Pozice aktualniPozice;

    public Map<Pozice, Lokace> povoleneLokace;

    public Mapa(Inventar inventar) {

        Jdi prikazJdi = new Jdi(this);
        Zvedni prikazZvedni = new Zvedni(this, inventar);

        ArrayList jdi = new ArrayList();
        jdi.add(prikazJdi.getPrikaz());

        ArrayList jdiZvedni = new ArrayList();
        jdiZvedni.add(prikazJdi.getPrikaz());
        jdiZvedni.add(prikazZvedni.getPrikaz());

        ArrayList predmety = new ArrayList();
        predmety.add("kámen");
        predmety.add("nůž");

        povoleneLokace = new HashMap<>();
        povoleneLokace.put(new Pozice(0, 1), new Lokace(jdi));
        povoleneLokace.put(new Pozice(1, 1), new Lokace(jdiZvedni, predmety));
        povoleneLokace.put(new Pozice(2, 1), new Lokace(jdi));
        povoleneLokace.put(new Pozice(0, 1), new Lokace(jdi));
        povoleneLokace.put(new Pozice(1, 2), new Lokace(jdi));

        aktualniPozice = (new Pozice(1, 1));
    }

    public boolean muzuJit(String smer) {
        if (smer.equals("sever")) {
            Pozice nova = new Pozice(aktualniPozice.getX(), aktualniPozice.getY() + 1);
            return povoleneLokace.containsKey(nova);
        } else if (smer.equals("jih")) {
            Pozice nova = new Pozice(aktualniPozice.getX(), aktualniPozice.getY() - 1);
            return povoleneLokace.containsKey(nova);
        } else if (smer.equals("vychod")) {
            Pozice nova = new Pozice(aktualniPozice.getX() + 1, aktualniPozice.getY());
            return povoleneLokace.containsKey(nova);
        } else if (smer.equals("zapad")) {
            Pozice nova = new Pozice(aktualniPozice.getX() - 1, aktualniPozice.getY());
            return povoleneLokace.containsKey(nova);
        } else {
            return false;
        }
    }

    public Pozice jdi(String smer) {
        if (smer.equals("sever")) {
            aktualniPozice = new Pozice(aktualniPozice.getX(), aktualniPozice.getY() + 1);
            return aktualniPozice;
        } else if (smer.equals("jih")) {
            aktualniPozice = new Pozice(aktualniPozice.getX(), aktualniPozice.getY() - 1);
            return aktualniPozice;
        } else if (smer.equals("vychod")) {
            aktualniPozice = new Pozice(aktualniPozice.getX() + 1, aktualniPozice.getY());
            return aktualniPozice;
        } else if (smer.equals("zapad")) {
            aktualniPozice = new Pozice(aktualniPozice.getX() - 1, aktualniPozice.getY());
            return aktualniPozice;
        } else {
            return aktualniPozice;
        }
    }

    public Lokace getAktualniLokace() {
        return povoleneLokace.get(aktualniPozice);

    }

}
