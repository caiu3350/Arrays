/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SamplePrograms;

/**
 *
 * @author caiu3350
 */
public class Array2DEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x[][]=new int[4][5];
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 5; col++) {
                int num=10*row+col;
                x[row][col]=num;
                System.out.format("%5d |",x[row][col]);
            }
            System.out.println("");
        }
        int marks[][] = {
            {67,78,67,55},
            {88,65,77,99},
            {34,35,45,54},
            {88,66,44,55},
        };
        for (int row = 0; row < marks.length; row++) {
            for (int col = 0; col < marks[row].length; col++) {
                System.out.format("%5d |",x[row][col]);
            }
            System.out.println("");
        }
    }
    
}
