/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_23_meses_switch;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_23_MESES_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int meses;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduzca el numero de mes (1 al 7)");
        meses = captu.nextInt();
        captu.nextLine();
        
        switch (meses){
            case 1: System.out.println("Enero");
            break ;
            case 2: System.out.println("Febrero");
            break ;    
            case 3: System.out.println("Marzo");
            break ;
            case 4: System.out.println("Abril");
            break ;
            case 5: System.out.println("Mayo");
            break;
            case 6: System.out.println("Junio");
            break ;
            case 7: System.out.println("Julio");
            break ;
            case 8: System.out.println("Agosto");
            break ;
            case 9: System.out.println("Septiembre");
            break ;
            case 10: System.out.println("Octubre");
            break ;
            case 11: System.out.println("Noviembre");
            break ;
            case 12: System.out.println("Diciembre");
            break ;
            default: System.out.println("No es un mes valido");
        }
    }
    
}
