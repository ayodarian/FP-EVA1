/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_12_formulas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_12_FORMULAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double v1, tiempo, ace, dist1, dist2, dist3;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduzca los datos de la formula");
        System.out.print("velocidad inicial = ");
        v1 = captu.nextDouble();
        System.out.print("Tiempo en segundos = ");
        tiempo = captu.nextDouble();
        System.out.println("Aceleracion = ");
        ace = captu.nextDouble();
        dist1 = (ace*(tiempo*tiempo))/2.0;
        dist2 = v1*tiempo;
        dist3 = dist2 + dist1;
        System.out.print("El resultado de la distancia es = ");
        System.out.println(dist3);
                
    }
    
}
