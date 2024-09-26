/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_22_switch;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_22_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int diaSem;
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura el dia de la semana (1 al 7)");
        diaSem = captu.nextInt();
        captu.nextLine();
        System.out.print("Tu dia elgido es: ");
        
        
        switch (diaSem){
            case 1: System.out.println("Domingo");
            break; // Interrumpe el swtich (Lo termina)
            case 2: System.out.println("Lunes");
            break;
            case 3: System.out.println("Martes");
            break;
            case 4: System.out.println("Miercoles");
            break;
            case 5: System.out.println("Jueves");
            break;
            case 6: System.out.println("Viernes");
            break;
            case 7: System.out.println("Sabado");
            break;
            default:// Es opcional igual que el else
                //No tiene breake ademas de que es la ultima instruccion
                System.out.println("Numero de dia no valido");
        }
                
        
    }
    
}
