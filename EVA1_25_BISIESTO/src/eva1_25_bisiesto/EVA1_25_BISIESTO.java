/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_25_bisiesto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_25_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ye;
        Scanner captu = new Scanner(System.in);
        System.out.println("Este es un programa para saber si un año es bisiesto");
        System.out.print("Introduce tu año: ");
        ye = captu.nextInt();
        captu.nextLine();
        
        if ((ye%4==0 && ye%100!=0) || (ye%400==0)) {
            System.out.println("Tu año es bisiesto");
        } else {
            System.out.println("Tu año no es bisisesto ");
        }
    }
    
}
