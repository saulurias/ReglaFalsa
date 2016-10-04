/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglafalsa;

/**
 *
 * @author SaulUrias
 */
public class ReglaFalsa {

    /**
     * @param args the command line arguments
     */
   public static double f (double x){
       
        double e = 2.718281828182;
    
        //Definimos una funcion de variable real
        double resultado = Math.pow(e, -1*x) -x; //Valor de la función
        
        return resultado;
    }
   
   public static double errorRelativo(double a, double b){
        double resultado = Math.abs( ( (a-b) / a )*100 );
        return resultado;
    }
    //Probamos en el programa principal
    public static void main(String[] args) {
        
        double a = 0, b = 1, c = 0, ea = 0.01;
        
        double error = 0, errorAnterior =0;
        double calculoError = 0;
        int iteraciones = 0;
        
        
        
        
        if (f(a)*f(b)>0){
            System.out.println("No se cumple que f(a)*f(b)<0.");
            return;
        }
        
        do {
            errorAnterior = error; //guardar error anterior
            
            c = ((f(a)*b)-(f(b)*a))/(f(a)-f(b)); //calcular c
            error = c; //guardar error actual
            
            //System.out.println(error+" - "+ errorAnterior+" / "+error);
            calculoError = errorRelativo(error, errorAnterior); //calcular el error relativo
            //System.out.println("abs "+calculoError);
            
            //condicional para reacomodar los limites que estan calculando la raiz
            if(f(a)*f(c) < 0) { 
                b = c;
            }
            else{
                a = c;
            }
            
            
            iteraciones++;
        } while (a != b && calculoError > ea);
         
         System.out.println("La raiz estimada es c = " + c);
         System.out.println("El valor de f en c = " + f(c));
        
        
        
      
    }
    
}