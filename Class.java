
/**
 * Write a description of class Class here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Class
{

   
    //the function is: x^3
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main (String [] args) throws Exception
    {
//         double period=4;
//         double l=period/2;
//         int iterations;
//         double azero = 
        integrate("a",-2,2,10,4);
    }
    
   
    
//     public static void integrate(String whichOne, String function,double lower, double higher, int n, double period) throws Exception{
//         int accuracy=1000;
//         double deltax=(higher-lower)/accuracy;
//         double l=period/2;
//         ScriptEngineManager mgr= new ScriptEngineManager();
//         ScriptEngine engine = mgr.getEngineByName("JavaScript");
//         //double ctr=0;
//         double sum=0;
//         if (whichOne.equals("a")) {
//         for (int ctr=1; ctr<=n; ctr++) {    
//         for (int a=0; a<accuracy; a++){
//             //change this if you want to change the function
//             String fa=function.replace("x","("+lower+")");
//             
//             //double faEval= Double.parseDouble((engine.eval(fa)).toString());
//             //String fb=function.replace("x","("+(lower+deltax)+")");
//             //double fbEval=Double.parseDouble((engine.eval(fb)).toString());
//             sum+=(deltax/2)*(((Math.pow(lower,3)-4*lower)*Math.cos(((ctr*Math.PI)/l)*lower))+((Math.pow(lower+deltax,3)-4*(lower+deltax))*Math.cos(((ctr*Math.PI)/l)*(lower+deltax))));
//             lower+=deltax;
//         }
//         System.out.println((1/l)*sum);
//     }
//     }
//     else{
//         for (int ctr=1; ctr<=n; ctr++) { 
//         for (int a=0; a<accuracy; a++){
//               String fa=function.replace("x","("+lower+")");
//             
//             //double faEval= Double.parseDouble((engine.eval(fa)).toString());
//             //String fb=function.replace("x","("+(lower+deltax)+")");
//             //double fbEval=Double.parseDouble((engine.eval(fb)).toString());
//             sum+=(deltax/2)*(((Math.pow(lower,3)-4*lower)*Math.sin(((ctr*Math.PI)/l)*lower))+((Math.pow(lower+deltax,3)-4*(lower+deltax))*Math.sin(((ctr*Math.PI)/l)*(lower+deltax))));
//             lower+=deltax;
//         }
//         System.out.println((1/l)*sum);
//     }
//     }
//     }
//     
    public static void integrate(String whichOne,double lower, double higher, int n, double period){
        int accuracy=1000000;
        double deltax=(higher-lower)/accuracy;
        final double lowerFinal=lower;
        double l=period/2;
        //double ctr=0;
        double sum=0;
        
        if (whichOne.equals("a")) {
            System.out.println("Cosine coefficients");
        for (int ctr=1; ctr<=n; ctr++) {    
        for (int a=0; a<accuracy; a++){
            //change this if you want to change the function
  
            sum+=(deltax/2)*(((Math.pow(lower,2))*Math.cos(((ctr*Math.PI)/l)*lower))+((Math.pow(lower+deltax,2)))*Math.cos(((ctr*Math.PI)/l)*(lower+deltax)));
            lower+=deltax;
        }
        System.out.println(ctr+". "+(1/l)*sum);
        sum=0;
        lower=lowerFinal;
    }
    }
    else{
        System.out.println("Sine coefficients");
        for (int ctr=1; ctr<=n; ctr++) { 
        for (int a=0; a<accuracy; a++){
            //change this if you want to change the function
            sum+=(deltax/2)*(((Math.pow(lower,2))*Math.sin(((ctr*Math.PI)/l)*lower))+((Math.pow(lower+deltax,2))*Math.sin(((ctr*Math.PI)/l)*(lower+deltax))));
            lower+=deltax;
        }
        System.out.println(ctr+". "+(1/l)*sum);
        sum=0;
        lower=lowerFinal;
    }
    }
    }
}
