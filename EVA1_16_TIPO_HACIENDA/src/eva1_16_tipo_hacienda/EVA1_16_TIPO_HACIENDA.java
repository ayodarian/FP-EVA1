/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_16_tipo_hacienda;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_16_TIPO_HACIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char tipo;
        Scanner captu = new Scanner(System.in);
        System.out.println("Tipo de persona F --> FISICA M --> MORAL");
        tipo = captu.nextLine().charAt(0);
       
        // IMPRIMIR EL TIPO DE PERSONA
        // "" --> Cadena de texto, '' --> Es un caracter
        if (tipo == 'F') {
            System.out.println("FISICA");
            
        } else { System.out.println("MORAL");
        }
        
    }
    
}
