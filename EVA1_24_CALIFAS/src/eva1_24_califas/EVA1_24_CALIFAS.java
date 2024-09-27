/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_24_califas;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_24_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cali;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce tu calificacion en numero para convertirla a letra");
        cali = captu.nextInt();
        captu.nextLine();
        
        if (cali<=100 && cali>=90) {
            System.out.println("Tu calificacion es A");
        } else if (cali<=89 && cali>=80){ 
            System.out.println("Tu calificacion es B");
        }else if (cali<=79 && cali>=70){ 
            System.out.println("Tu calificacion es C");
        }else if (cali<=69 && cali>=60){ 
            System.out.println("Tu calificacion es D");
        }else if (cali<=59 && cali>=0){ 
            System.out.println("Tu calificacion es F");
        }else { 
            System.out.println("Introduce una calificacion valida (del uno al 100)");
        }
    }
    
}
