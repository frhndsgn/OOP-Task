/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author zak-dev
 */
public class Percabangan {
    public static void main (String[]args){
        int nilai = 85;
        if (nilai >= 80){
            System.out.println ("Nilai " + nilai + " Mendapatkan indeks A");
        }else if(nilai > 70){
            System.out.println ("Nilai " + nilai + " Mendapatkan indeks B");
        }else{
            System.out.println ("Nilai " + nilai + " Mendapatkan indeks E");
        }
    }
}
