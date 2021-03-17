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
public class output {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int k = 10; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
