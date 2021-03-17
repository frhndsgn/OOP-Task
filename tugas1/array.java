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
public class array {

    public static void main(String[] args) {
        String[][] databuku = new String[3][2];
        databuku[0][0] = "Java";
        databuku[0][1] = "Netbeans";
        databuku[1][0] = "PBO";
        databuku[1][1] = "Informatika";
        databuku[2][0] = "Modul";
        databuku[2][1] = "Praktikum";

      
        for (int i = 0; i < 3; i++) {
          
            for (int j = 0; j < 2; j++) {
                System.out.println(databuku[i][j] + "  ");
            }
            System.out.println();
        }
    }
}



