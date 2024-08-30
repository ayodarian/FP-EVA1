/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_7_captura_auto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_7_CAPTURA_AUTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String marca;
        String modelo;
        int año;
        double precio;
        
        Scanner captu;
        captu = new Scanner(System.in);
        
        System.out.println("Indica la marca del carro");
        marca = captu.nextLine();
        System.out.println("Indica el modelo del carro");
        modelo = captu.nextLine();
        System.out.println("Indica el año del carro");
        año = captu.nextInt();
        System.out.println("Indica el precio del carro");
        precio = captu.nextDouble();
        
        System.out.println("Verifica los datos ingresados");
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(año);
        System.out.println(precio);
        
    }
    
}
