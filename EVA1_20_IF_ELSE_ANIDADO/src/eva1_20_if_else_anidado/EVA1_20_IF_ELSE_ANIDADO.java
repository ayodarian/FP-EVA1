/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_20_if_else_anidado;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_20_IF_ELSE_ANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura el numero de dia (1 a 7)");
        dia = captu.nextInt();
        captu.nextLine();
        
        if (dia == 1) {
            System.out.println("Domingo");
            
        }  else if (dia == 2){
            System.out.println("Lunes");
        }  else if (dia == 3){
            System.out.println("Martes");
        }  else if (dia == 4){
            System.out.println("Miercoles");
        }  else if (dia == 5){
            System.out.println("Jueves");
        }  else if (dia == 6){
            System.out.println("Viernes");
        }  else if (dia == 7){
            System.out.println("Sabado");
        }  else{
            System.out.println("El numero de dia es incorrecto");
        }
    }
}
