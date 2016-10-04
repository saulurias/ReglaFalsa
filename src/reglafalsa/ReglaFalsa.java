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
       //Insertar la función 
        double e = 2.718281828182;
        
        double resultado = Math.pow(e, -1*x) -x;
        
        return resultado;
    }
    
    public static void main(String[] args) {
        
        double a = 0, b = 1, c = 0;
        
        if (f(a)*f(b)>0){
            System.out.println("No se cumple que f(a)*f(b)<0.");
            return;
        }
        while (true){
            
            c = ((f(a)*b)-(f(b)*a))/(f(a)-f(b));
            if (Math.abs(f(c))<=1e-10){
                System.out.println("La raiz estimada es r = " + c);
                System.out.println("El valor de f en rs = " + f(c));
                return;
            }
            if (f(a)*f(c)<0) {
                b = c;
            }else{
                a = c;
            }
        }
    }
}
