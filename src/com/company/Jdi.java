package com.company;

/**
 * Created by jbalhar on 28. 2. 2016.
 */
public class Jdi extends Akce{
   public Jdi (Mapa mapa){ // konstruktor se odkazuje na classu Mapa
      super ("jdi",1);
      this.mapa=mapa;

   }

   Mapa mapa;
   public void proved(String[] parametry) {

   }
}
