/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autohaus;

/**
 *
 * @author Markus_Mayr
 */
public class Autohaus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto a1 = new Auto("Ford", 125000, 7999.99,"silber metallic", false,"Diesel", 101.0);
        Auto a2 = new Auto("Mercedes", 63000, 22999.99,"blue silver", true,"Super", 137.0);
        Auto a3 = new Auto("Daihatsu", 12000, 3099.99,"green dynamite", true,"Benzin", 75.0);
        
        Auto[] array = new Auto[3];
        array[0] = a1;
        array[1] = a2;
        array[2] = a3;
        bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    public static void bubbleSort(Auto[] array) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (!(array[i].getPreis() <= array[i + 1].getPreis())) {
                    Auto dummy = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = dummy;
                    unsorted = true;
                }
            }
        }
    }
}
