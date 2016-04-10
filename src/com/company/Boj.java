package com.company;

/**
 * Created by TIBOR on 3.4.2016.
 */
public class Boj {

    public void kolo(Hrdina hrdina, Bytost bytost) {
        utok(hrdina, bytost);
        obrana(hrdina, bytost);

    }


    private void utok(Hrdina hrdina, Bytost bytost) {

        Integer utokHrd = hrdina.getUtok();
        Integer obranaByt = bytost.getObrana();

        Integer hodHrd = (int) Math.round(Math.random()*6);
        Integer hodByt = (int) Math.round(Math.random()*6);

        int utokHrdCelkem = utokHrd + hodHrd;
        int obranaBytCelkem = obranaByt + hodByt;

        if (utokHrdCelkem > obranaBytCelkem) {
            int rozdil = utokHrdCelkem - obranaBytCelkem;
            bytost.setZivoty(bytost.getZivoty() - rozdil);
            System.out.println(bytost.getJmeno() + "se neubránil.");

        } else {
            System.out.println(bytost.getJmeno() + "se ubránil.");
        }

    }

    private void obrana(Hrdina hrdina, Bytost bytost) {
        Integer utokByt = bytost.getUtok();
        Integer obranaHrd = hrdina.getObrana();

        Integer hodHrd = (int) Math.round(Math.random()*6);
        Integer hodByt = (int) Math.round(Math.random()*6);

        int obranaHrdCelkem = obranaHrd + hodHrd;
        int utokBytCelkem = utokByt + hodByt;

        if (utokBytCelkem > obranaHrdCelkem) {
            int rozdil = utokBytCelkem - obranaHrdCelkem;
            hrdina.setZivoty(hrdina.getZivoty() - rozdil);
            System.out.println("ses ubránil.");
        } else {
            int rozdil = utokBytCelkem - obranaHrdCelkem;
            System.out.println(bytost.getJmeno() + "Tě zranila za" + rozdil);
            System.out.println("Máš " + hrdina.getZivoty() + "žovotů." );
        }
    }

}

