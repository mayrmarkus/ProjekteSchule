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
        int[] array = new int[10];
        generierenrand(array);
        arrayausgabe(array);
        bubblesort(array);
        arrayausgabe(array);
        insertionsort(array);
    }

    private static void bubblesort(int[] array) {
        for(int i=array.length -1; i>0; i--){
        
            for(int j=0; j<array.length-1; j++ ){
            
                if(array[j]>array[j+1]){
                
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            
            }
        
        }
    }

    private static void generierenrand(int[] array) {
        Random rand = new Random();
        
        for(int i=0;i<array.length;i++){
            array[i]= rand.nextInt(50);
        }
    
    }

    private static void arrayausgabe(int[] array) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
            if (i < array.length - 1){
                 System.out.print(", ");
            }
        }
        System.out.println("");
    }


    private static void insertionsort(int[] array) {
        int temp, a;
        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            a=i;
            while(a>=i && array[a-1] > temp){
                array[a] = array[a-1];
                
            }
        }
    }
    }
