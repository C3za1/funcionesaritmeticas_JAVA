
package Funciones;
import java.util.Scanner;
import Funciones.casos;

public class JavaApplication4 
{
     public static void main(String[] args) 
     {
         // crea objeto Scanner para obtener la entrada de la ventana de comandos 
         Scanner RT = new Scanner (System.in);
         int valor1;
         int valor2;
          //es para mostrar funciones aritmeticas
       System.out.println("calculando funciones aritmeticas\n");
       //es para mostrar rl valor
       System.out.println("Ingrese primer valor ");
       //leer el valor
       valor1=RT.nextInt();
       //es para mostrar el segundo valor
       System.out.println("Ingrese su segundo valor: ");
       //leer el valor 2
       valor2=RT.nextInt();
       
    
       casos w = new casos(valor1,valor2);
    
       //es para mostrar la suma de dos numeros
       System.out.println("La suma de los numeros es:"+w.suma());
       //es para mostrar la multiplicacion de los dos numeros
       System.out.println("La multiplicacion de los numeros es:"+w.multiplicacion());
       //es para mostrar la divicion de los dos numeros
       System.out.println("La divicion de los numeros es:"+w.divicion());   
       
    }
    
}
