package com.company;

/**
 * Created by TIBOR on 14.2.2016.
 */
public class Pozice {
    public Pozice(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int x;//proměnná v instanci třídy
    public int y;

    @Override
    public boolean equals(Object obj) {//metoda

        if (!(obj instanceof Pozice)) {
        }

        Pozice poz = (Pozice) obj; //proměnná v metodě
        if ( x == poz.getX() && y == poz.getY() ){
          return true;
        }
        else {
            return false
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
// úkol napsat možnost posunu východ, západ, sever, jih