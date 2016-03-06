package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by TIBOR on 14.2.2016.
 */
public class Mapa {
    public Pozice aktualniPozice;

    public Mapa() {
        povoleneLokace = new ArrayList();

        povoleneLokace.add(new Pozice(0, 1));
        povoleneLokace.add(new Pozice(1, 1));
        povoleneLokace.add(new Pozice(2, 1));
        povoleneLokace.add(new Pozice(0, 1));
        povoleneLokace.add(new Pozice(1, 2));

        aktualniPozice = (new Pozice(1, 1));
    }

    public ArrayList povoleneLokace;


    public boolean muzuJit(String smer) {
        if (smer.equals("sever")) {
            Pozice nova = new Pozice(aktualniPozice.getX(), aktualniPozice.getY() + 1);
            return povoleneLokace.contains(nova);
        } else if (smer.equals("jih")) {
            Pozice nova = new Pozice(aktualniPozice.getX(), aktualniPozice.getY() - 1);
            return povoleneLokace.contains(nova);
        } else if (smer.equals("vychod")) {
            Pozice nova = new Pozice(aktualniPozice.getX() + 1, aktualniPozice.getY());
            return povoleneLokace.contains(nova);
        } else if (smer.equals("zapad")) {
            Pozice nova = new Pozice(aktualniPozice.getX() - 1, aktualniPozice.getY());
            return povoleneLokace.contains(nova);
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

}
