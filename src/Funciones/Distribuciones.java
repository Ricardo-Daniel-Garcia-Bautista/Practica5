/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
 */
package Funciones;

/**
 *
 * @author Mega_
 */
public class Distribuciones {
    public static int Bernoulli(double p){
        double v = Math.random();
        if(v <= p){
            return 1;
        } else {
            return 0;
        }
    }
    public static int Poisson(double m){
        double v = 0;
        int x = 0;
        double Lim = Math.exp(-m);
        double valor = 1;
        while(valor <= Lim){
             v = Math.random();
            x++;
        }
        return (x);
    }
    
    public static int Geomtrica(double g){
        double v = Math.random();
        if(v<=g){
            return 1;
        } else {
            return 0;
            
        }
                
    }
    public static double Exponencial(double e){
        return -e*Math.log(Math.random());
    }
   
    public static double Normal(double a, double b, double c){
        double w;
        w= (1/(Math.pow(2*b*Math.PI, b)))*(Math.exp(Math.pow(-(a-c),2))/2*(b*b));
        return w;
    }
}
