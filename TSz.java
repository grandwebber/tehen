package com.company;

import java.util.ArrayList;

public class TSz {
    // az egyetlen privát adattag egy teheneket tartalmazó lista
    private ArrayList<Tehen> tehenek;

    // írd meg a konstruktort
    public TSz() {    //nem kap paramétert, mainben sincs
        tehenek = new ArrayList<>();
    }

    // írd meg az tehenetVesz metódust, mely a paraméterül tehenet
    // hozzáadja a listához
    public void tehenetVesz(Tehen tehen) {
        tehenek.add(tehen);
    }

    // írj egy metódust getNapiHozam néven, amely visszaadja a
    // listában lévő tehenek napi tejhozamának összegét
    public int getNapiHozam() {
        int result = 0;
        for (Tehen t : tehenek) {
            return t.getNapiTejhozam();
        }
        return result;
    }

    // írj egy metódust marhatVag néven, mely kiveszi a listából
    // az állomány leggyengébben tejelő tehenét
    public void marhatVag() {    //melyik a leggyengébb? minimumkeresés
        Tehen leggyengebb = null;
        for (Tehen t : tehenek) {
            if (leggyengebb == null || t.getNapiTejhozam() < leggyengebb.getNapiTejhozam()) {
                leggyengebb = t;
            }
        }
        tehenek.remove(leggyengebb);
    }

    // írj egy metódust legjobbDijnyertes néven, mely a legjobban
    // tejelő díjnyertes tehenet adja vissza
    public Tehen legjobbDijnyertes() {    //visszatérési tipus az tehén mert tehenet ad vissza
        Tehen legjobb = null;
        for (Tehen t : tehenek) {
            if (t.dijNyertes() && (legjobb == null || t.getNapiTejhozam() > legjobb.getNapiTejhozam())) {
                legjobb = t;
            }
        }
        return legjobb;
    }

    // a TSZ-t kiíró metódus írja ki az állományt (ld. Main osztály)
    public String toString() {
        return tehenek.toString();
    }
}
