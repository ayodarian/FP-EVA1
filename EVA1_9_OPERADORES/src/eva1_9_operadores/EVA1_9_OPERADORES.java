/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_9_operadores;

/**
 *
 * @author invitado
 */
public class EVA1_9_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Operaciones atitmeticas   
        //iniciacion de una variable
        int x = 10;
        int y = 5;
        int suma,resta,multi,div, raiz,pot;
        
        //suma y resta
        suma = x + y;
        System.out.println("La suma de x +  y es:");
        System.out.println(suma);
        
        resta = x - y;
        System.out.println("La resta de x- y es:");
        System.out.println(resta);
        
        //Multiplicacion
        
        multi = x * y;
        System.out.println("El resultado de la multiplicacion de x * y es:");
        System.out.println(multi);
        
        //Division
        
        div = x / y;
        System.out.println("El resultado de la division de x/y es:");
        System.out.println(div);
        x = 5;
        y = 2;
        
        div = x / y;
        System.out.println("El resultado de la division es:");
        System.out.println(div);
        
        //division con numeros con punto flotante
        
        double vall = 5;
        double val2 = 2;
        double resu = vall/val2;
        
        System.out.println("Division de la vall/val2");
        System.out.println(resu);
       
     
    }
    
}
