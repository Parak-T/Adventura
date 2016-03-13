package com.company;

import com.company.akce.Akce;

import java.util.List;

/**
 * Created by TIBOR on 1.2.2016.
 */
public class Lokace {
    public List povoleneAkce;

    public Lokace(List akce) {
        this.povoleneAkce = akce;
    }

    public boolean jdeProvest (Akce akce) {

            return povoleneAkce.contains(akce);

    }

}
