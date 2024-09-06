/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_11_conversiones;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_11_CONVERSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONVERSION DE TEMPERATURA
        
        //Conversion de farenheit a celcius
        
        double far, cent;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce los grados farenheit a para convertirlos a grados celcius");
        far = captu.nextDouble();
        cent = (far-32)/1.8;
        System.out.print("La temperatura en grados centigrados es: ");
        System.out.println(cent);
        
        //Conversion de celcius a farenheit
        
        System.out.println("Ahora introduce tus grados celcius para convertirlos a farenheit");
        cent = captu.nextDouble();
        far = (cent*1.8)+32;//No es necesario crear mas variables por que podemos reutilizar las que ya designamos
        System.out.println("Tus grados comvertidos serian: ");
        System.out.print(far);
        
    }
    
}
