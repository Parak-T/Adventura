package com.company;

import java.util.ArrayList;

/**
 * Created by TIBOR on 14.2.2016.
 */
public class Mapa {
    public Pozice aktualniPozice;

    public Mapa() {
        povoleneLokace = new ArrayList();

        povoleneLokace.add( new Pozice(0,1) );
        povoleneLokace.add( new Pozice(1,1) );
        povoleneLokace.add( new Pozice(2,1) );
        povoleneLokace.add( new Pozice(0,1) );
        povoleneLokace.add( new Pozice(1,2) );

        aktualniPozice = ( new Pozice(1,1) );
    }

    public ArrayList povoleneLokace;

}
