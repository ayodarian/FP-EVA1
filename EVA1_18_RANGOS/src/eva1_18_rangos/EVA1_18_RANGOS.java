/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_18_rangos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_18_RANGOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int califa;
    Scanner captu = new Scanner(System.in);
    System.out.println("Introduce tu calificacion");
    califa = captu.nextInt();
        if (califa>=0 && califa<=100) {
            System.out.println("Calificacion valida");    
        } else {
            System.out.println("Calificacion no valida");
        }
    
    }
    
}
