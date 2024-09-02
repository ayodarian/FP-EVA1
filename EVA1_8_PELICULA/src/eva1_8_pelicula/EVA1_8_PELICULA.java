/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_pelicula;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_8_PELICULA {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String genero;
        int duracion;
        String reparto;
        String clasificacion;
        
        Scanner captu;
        captu = new Scanner(System.in);
        
        System.out.println("Captura el nombre de la pelicula");
        nombre = captu.nextLine();
        System.out.println("Captura el genero de la peliculaa");
        genero = captu.nextLine();
        System.out.println("Captura en segundos la duracion de la pelicula");
        duracion = captu.nextInt();
        System.out.println("Captura los principales 4 actores del reparto");
        reparto = captu.nextLine();
        reparto = captu.nextLine();
        reparto = captu.nextLine();
        reparto = captu.nextLine();
        System.out.println("Captura la clasificacion de la pelicula");
        clasificacion = captu.nextLine();
        
        System.out.println("DATOS GUARDADOS CON EXTITO");
        System.out.println(nombre);
        System.out.println(genero);
        System.out.println(duracion);
        System.out.println(clasificacion);
        
        
;         
               
                
    }
    
}
