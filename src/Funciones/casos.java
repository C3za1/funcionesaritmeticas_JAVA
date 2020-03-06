
package Funciones;


public class casos {
    
    //declaracion de variables
    int valor1;
    int valor2;

    public casos(int numero1, int numero2){
       valor1=numero1;
       valor2=numero2;
    }
   
    
    public int suma(){
        int resul;
        resul=valor1+valor2;
        return resul;
        
    }
    
    public int multiplicacion(){
        int resul;
        resul=valor1*valor2;
        return resul;
   }
    
   public double divicion(){
       double resul;
       resul=valor1/valor2;
       return resul;
   } 
    
}
