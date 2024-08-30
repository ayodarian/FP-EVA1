/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_6_entrada_datos2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_6_ENTRADA_DATOS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad;
        String curp;
        double promedio;
        //crear nuestro scanner
        Scanner captu;
         //es una variable de tipo scanner que no es tan diferente a las otras pero lleva un proceso diferente
        captu = new Scanner(System.in);
        
        //CAPTURAR
        
        System.out.println("Captura tu nombre completo");
        nombre = captu.nextLine();
        System.out.println("Captura tu CURP");
        curp = captu.nextLine();
        System.out.println("Captura tu edad");
        edad = captu.nextInt();
        System.out.println("Captura tu promedio");
        promedio = captu.nextDouble();
        
        //IMPRESION:
        
        System.out.println("Revise cuidadosamente los datos proporcionados:");
        System.out.println(nombre);
        System.out.println(curp);
        System.out.println(edad);
        System.out.println(promedio);
        
        
        
        
                
        
       
    }
    
}
