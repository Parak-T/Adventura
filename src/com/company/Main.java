package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Inventar truhla = new Inventar();
        truhla.přidat("vidlička");
        truhla.přidat("nůž");
        truhla.přidat("lžíce");
        truhla.přidat("veverka");

        truhla.vypiš();

        truhla.odeber("nůž");

        truhla.vypiš();

        truhla.přidat("sekera");

        truhla.vypiš();

        System.out.println("napiš cokoli"); // třída System pošle do konzoly text
        Scanner načítej = new Scanner(System.in); // vytvoří nový objekt Scanner pojmenovaný "načítej"
        while (načítej.hasNextLine()) { // dokud
            String příkaz = načítej.nextLine(); // řetězec "příkaz"
            if (příkaz.equals("vypiš")) {
                truhla.vypiš();// write your code here
            }
            String[] rozdělení = příkaz.split(" ");
            if (rozdělení[0].equals("seber")) {
                truhla.přidat(rozdělení[1]);
            }
            if (rozdělení[0].equals("polož")) {
                truhla.odeber(rozdělení[1]);
            }
            if (rozdělení[0].equals("zabij") && rozdělení[1].equals("veverka")) {
                if (truhla.ověř(rozdělení[1])) {
                    truhla.odeber(rozdělení[1]);
                    truhla.přidat("mrtvá veverka");
                }
                else {
                    System.out.println("chyť si veverku");
                }
            }
        }
    }
}
