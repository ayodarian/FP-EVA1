/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_14_califas;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_14_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int califa;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce tu calificacion final");
        califa = captu.nextInt();
        if (califa >= 70) {
            System.out.println("Acreditaste"); 
        } else { System.out.println("No acreditaste");
        }
                
             
    }
    
}
