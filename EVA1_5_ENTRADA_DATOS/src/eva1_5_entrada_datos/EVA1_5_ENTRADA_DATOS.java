/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_5_entrada_datos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_5_ENTRADA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        //captura de datos del teclado:
        //Scanner--> herramienta (clase)
        Scanner captu; //incorporar la herramiuenta al codigo (import)
        //no existe, hay que crearla
        captu = new Scanner (System.in);//creamos la herramienta Scanner
        // Darle instruccion al usuaro
        System.out.println("Introduce tu nombre completo:");
        //capturamos
        nombre = captu.nextLine();//capturamos el texto
                                   // hasta que se presiona la tecla "enter"
        System.out.println("---------DATOS CAPTURADOS---------");
        System.out.println(nombre);
                
        
      
    }
    
}
