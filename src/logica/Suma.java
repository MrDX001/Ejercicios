
package logica;

import java.util.Scanner;


public class Suma {
    public void operacion(){
        int numero1,numero2,suma;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("digite el primer numero: ");
        numero1= entrada.nextInt();
        System.out.println("digite el ssegundo numero: ");
        numero2= entrada.nextInt();
        suma=numero1+numero2;
        System.out.println("la suma de los numeros es: "+suma);
    }
}
