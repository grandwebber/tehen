package com.company;

public class Tehen {
    // A tehénre jellemző (privát) tulajdonságok:
    // név, napi tejhozam, díjnyertesség (logikai változó)
    private String nev;
    private int napiTejhozam;
    private boolean dijNyertes;


    // írd meg a konstruktorokat úgy, hogy a szűkebb konstruktor
    // a bővebb konstruktort hívja (ld. Main osztály)
    public Tehen(String nev, int napiTejhozam, boolean dijNyertes) {
        this.nev = nev;
        this.napiTejhozam = napiTejhozam;
        this.dijNyertes = dijNyertes;
    }
    public Tehen(String nev, int napiTejhozam) {
      this(nev,napiTejhozam,false);                                  //meghívjuk a másik konstruktort, a mainben látszik hogy 2 kontruktor van

    }


    // írj nyilvános lekérdező metódusokat a dijNyertes és a
    // napiTejhozam adattagokhoz!
public String getNev(){
        return nev;
}
public int getNapiTejhozam(){
        return napiTejhozam;
}



    // valósítsd meg egy tehén kiírását úgy, hogy a metódus a        //toString
    // tehén nevét adja vissza!
public String toString(){
        return nev;
}

}
