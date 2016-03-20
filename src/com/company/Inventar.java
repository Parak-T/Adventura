package com.company;

import java.util.ArrayList;

/**
 * Created by TIBOR on 18.1.2016.
 */
public class Inventar {
    public Inventar() {
        predmety = new ArrayList();
    }

    public ArrayList predmety;

    public void pridat(String vec) {
        predmety.add(vec);
    }

    public void vypis() {
        for (Object vec : predmety) {
            System.out.println(vec);
        }
    }

    public void odeber(String vec) {
        predmety.remove(vec);
    }

    public boolean ověř (String vec){
        return predmety.contains(vec);
    }
}

