/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SamplePrograms.ArrayMethods;

/**
 *
 * @author caiu3350
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int abc[] = {40,7,67,8,9};
        for (int i = 0; i < abc.length; i++) {
            System.out.print(abc[i] + ", ");
        }
        changeTo10(abc);
        for (int i = 0; i < abc.length; i++) {
            System.out.print(abc[i] + ", ");
        }
    }
    public static void changeTo10(int x[]){
        for (int i = 0; i < x.length; i++) {
            x[i] = 10;
        }
        
    }
    
}
