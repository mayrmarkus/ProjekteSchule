/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feuerwehr;

/**
 *
 * @author Markus
 */
public class Notsignalgeber {

    private int zeitErstes;
    private int zeitZweites;

    public Notsignalgeber(int zeitErstes, int zeitZweites) {
        this.zeitErstes = zeitErstes;
        this.zeitZweites = zeitZweites;
    }

    public void ticking() {
        for (int i = 0; i < (zeitErstes + zeitZweites) + 1; i++) {
            if (zeitErstes == i) {
                System.out.println("Notsignal: 50 db, Zeit: " + (i + 1));
            } else if (zeitErstes + zeitZweites == i) {
                System.out.println("Notsignal: 100 db, Visuellessignal, Zeit: " + (i + 1));
            } else if (zeitErstes < i) {
                System.out.println("Notsignal: 50 db, Visuellessignal, Zeit: " + (i + 1));
            } else {
                System.out.println("Kein Notsignal, Zeit: " + (i + 1));
            }
        }
    }
}
