package com.company;

public class Main {
    public static void main(String[] args) {
        Tehen riska = new Tehen("Riska", 50, true);
        Tehen bimbo = new Tehen("Bimbó", 30);
        Tehen bu = new Tehen("Bu", 40, true);
        TSz tsz = new TSz();
        tsz.tehenetVesz(riska);
        tsz.tehenetVesz(bimbo);
        tsz.tehenetVesz(bu);
        // A következő kiírás várt eredménye:
        // [Riska, Bimbó, Bu]
        System.out.println(tsz);
        // A következő kiírás várt eredménye:
        // 120
        System.out.println(tsz.getNapiHozam());
        // A következő kiírás várt eredménye:
        // Riska
     //   System.out.println(tsz.legjobbDijnyertes());
        tsz.marhatVag();
        // A következő kiírás várt eredménye:
        // [Riska, Bu]
        System.out.println(tsz);
    }
}
