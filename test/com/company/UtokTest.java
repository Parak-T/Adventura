package com.company;

import com.company.akce.Utok;
import org.junit.Test;

/**
 * Created by TIBOR on 1.5.2016.
 */
public class UtokTest {

    @Test
    public void testUtok() throws Exception {
        Hrdina hrdina = new Hrdina();
        Mapa mapa = new Mapa(hrdina);
        Boj boj = new Boj();

        Utok utokTest = new Utok(mapa, hrdina);
        utokTest.proved(new String[] {"napadni"});

    }
}
