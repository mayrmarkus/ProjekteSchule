/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortieren;

import java.util.Random;

/**
 *
 * @author Markus_Mayr
 */
public class Sortieren {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] unsortiert = new int [5];
        generierenrand(unsortiert);
        bubblesort(unsortiert);
    }

    private static void bubblesort(int[] unsortiert) {
        int temp;
        for (int i = 5; i < 0; i--) {
            for (int j = 0; j < 5; j++) {
                
            }
        }
    }

    private static void generierenrand(int[] unsortiert) {
        Random r = new Random();
        int randomzahl = r.nextInt(5)+1;
        for(int i = 0; i<5; i++){
            unsortiert[i] = randomzahl;
        }
    
    }
    
}
