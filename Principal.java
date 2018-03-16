/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ariel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] Arreglo = {10,20,30,40,50,60,70,80,90,100};//Arreglo con 10 elementos
        
    
        for (int i : Arreglo) {
            System.out.println("Valor = " + i);
        }
        
        String[] aCadenas = {"Hola", "Mundo", "¿Que", "Hace?",":v"};
        
        
        for (String aCad : aCadenas) {
            System.out.println(aCad);
        }
        
        
        int[][] aDos = new int[3][3];
        aDos[0][0] = 1;
        aDos[0][1] = 2;
        aDos[0][2] = 3;
        aDos[1][0] = 5;
        aDos[1][1] = 6;
        aDos[1][2] = 7;
        aDos[2][0] = 8;
        aDos[2][1] = 9;
        aDos[2][2] = 10;
        
        
        for (int[] aDo : aDos) {
            for (int i : aDo) {
                System.out.println(i);
            }
        }
        
        
        int[][][] aTres = new int[2][2][2];
        aTres[0][0][0] = 1;
        aTres[0][0][1] = 2;
        aTres[0][1][0] = 3;
        aTres[0][1][1] = 4;
        aTres[1][0][0] = 5;
        aTres[1][0][1] = 6;
        aTres[1][1][0] = 7;
        aTres[1][1][1] = 8;
        
        
        for (int[][] aTre : aTres) {
            for (int[] is : aTre) {
                for (int i : is) {
                    System.out.println(i);
                }
            }
        }
        
        
    }
    
}
