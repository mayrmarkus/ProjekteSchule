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
        int [] array = new int [10];
        generierenrand(array);
        arrayausgabe(array);
        bubblesort(array);
        arraysortausgabe(array);
    }

    private static void bubblesort(int[] array) {
        for (int i = array.length-1; i < 0; i--) {
            for (int j = 0; j < array.length; j++) {
                int temp = array [j+1];
                array[j+1] = array[j];
                array[j] = temp;
            }
        }
    }

    private static void generierenrand(int[] array) {
        Random r = new Random();
        for(int i = 0; i<array.length; i++){
            int tr = r.nextInt(50);
            array[i] = tr;
        }
    
    }

    private static void arrayausgabe(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array.length);
            if(i!=array.length-1)
                System.out.print(", ");
        }
        System.out.println("");
    }

    private static void arraysortausgabe(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array.length);
            if(i!=array.length-1)
                System.out.print(", ");
        }
        System.out.println("");
    }
    }
