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
        Sortieren a = new Sortieren();
        int[] array = new int[10];
        a.generierenrand(array);
        a.arrayausgabe(array);

        a.bubblesort(array);
        a.arrayausgabe(array);

        a.insertionsort(array);
        a.arrayausgabe(array);
        
        int high = array.length - 1;
        int low = 0;

        a.quicksort(array, low, high);
        a.arrayausgabe(array);

        a.timing(array);
    }

    private void bubblesort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private void generierenrand(int[] array) {
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }

    }

    private void arrayausgabe(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("");
    }

    private void insertionsort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && array[j] > temp) {
                array[j] = array[j - 1];
                j = j - 1;
            }
            array[j] = temp;
        }
    }

    private void timing(int[] array) {
        long vorb = System.nanoTime();
        bubblesort(array);
        long nachb = System.nanoTime();
        System.out.println((nachb - vorb) / 1000.00 + " Millisekunden (Bubblesort)");

        long vori = System.nanoTime();
        insertionsort(array);
        long nachi = System.nanoTime();
        System.out.println((nachi - vori) / 1000.00 + " Millisekunden (Insertionsort)");

        System.out.println((nachb - vorb - (nachi - vori)) / 1000.00 + " Differenz (Bubblesort - Insertionsort)");
    }

    void quicksort(int[] a, int low, int high) {
        if (low < high) {
            int pivot = a[high];
            int i = low;
            
            for (int j = low; j <= high - 1; j++) {
                if (a[j] <= pivot) {
                    int help = a[i];
                    a[i] = a[j];
                    a[j] = help;
                    i++;
                }
            }
            int help = a[i];
            a[i] = a[high];
            a[high] = help;

            quicksort(a, low, i - 1);
            quicksort(a, i + 1, high);
        }
    }

}
