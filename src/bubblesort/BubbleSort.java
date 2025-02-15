/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bubblesort;

/**
 *
 * @author alexb
 */
public class BubbleSort {
    public static void main(String[] args){
        int[] a = new int[5];
        int temp;
        for(int j=0; j<5; j++){
            a[j] = (int)(Math.random() * 10);
        }
        for(int pass=0; pass<4; pass++){
            for(int i = 0; i<4; i++){
                if(a[i] > a[i+1]){
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        for(int c = 0; c < 5; c++) {
            System.out.print(a[c] + " ");
        }
    }
}