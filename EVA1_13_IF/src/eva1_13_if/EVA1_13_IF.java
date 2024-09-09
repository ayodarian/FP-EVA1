/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // TODO code application logic here
        //COMPARACION LOGICA DE OPERADORES
        // < menor que
        // > mayor que
        // == igual que
        // !diferente que
        // >= mayor o igual que
        // <= menor o igual que
        // ! negacion
        
        int edad;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        edad = captu.nextInt();
        
        //INSTRUCCION IF
        //SI (ALGO SE CUMPLE) ES VERDADERO
        // QUE HAGO SI SE CUMPLE
        //SI NO SE CUMPLE (OPCIONAL) ES FALSO
        // QUE HAGO SI NO SE CUMPLE
        
        if (edad >= 18){
                //AQUI VAN TODAS LAS INSTRUCCIONES DE if
            System.out.println("Adulto: Mayor de edad");
        }else{
            System.out.println("Menor de edad");
        }
                
        
    }
    
}
