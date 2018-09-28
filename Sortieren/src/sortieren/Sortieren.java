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
        int[] array = new int[100];
        int[] refArray = new int[array.length];
        
        System.out.print("Unsortet:\t");
        a.generierenrand(array, refArray);
        a.arrayausgabe(array);

        System.out.print("Bubblesort:\t");
        a.bubblesort(array);
        a.arrayausgabe(array);
        a.refArray(array, refArray);

        System.out.print("Insertionsort:\t");
        a.insertionsort(array);
        a.arrayausgabe(array);
        a.refArray(array, refArray);
        
        System.out.print("Quicksort:\t");
        int high = array.length - 1;
        int low = 0;

        a.quicksort(array, low, high);
        a.arrayausgabe(array);
        a.refArray(array, refArray);

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

    private void generierenrand(int[] array, int[] refArray) {
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000);
            refArray[i] = array[i];
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
            int j = i-1;
            while (j >= 0 && array[j] > temp) {
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j+1] = temp;
        }
    }

    private void timing(int[] array) {
        System.out.println("");
        
        long vorb = System.nanoTime();
        bubblesort(array);
        long nachb = System.nanoTime();
        System.out.println((nachb - vorb) / 1000.00 + " Millisekunden (Bubblesort)");
        refArray(array, array);
        
        long vori = System.nanoTime();
        insertionsort(array);
        long nachi = System.nanoTime();
        System.out.println((nachi - vori) / 1000.00 + " Millisekunden (Insertionsort)");
        refArray(array, array);
        
        long vorq = System.nanoTime();
        insertionsort(array);
        long nachq = System.nanoTime();
        System.out.println((nachq - vorq) / 1000.00 + " Millisekunden (Quicksort)");
        refArray(array, array);
        
        System.out.println("");
        System.out.println((nachb - vorb - (nachi - vori)) / 1000.00 + " Differenz (Bubblesort - Insertionsort)");
        System.out.println((nachb - vorb - (nachq - vorq)) / 1000.00 + " Differenz (Bubblesort - Quicksort)");
        System.out.println((nachi - vori - (nachq - vorq)) / 1000.00 + " Differenz (Insertionsort - Quicksort)");
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

    private void refArray(int[] array, int[] refArray) {
        for (int i = 0; i < array.length; i++) {
            array[i] = refArray[i];
        }
    }

}
