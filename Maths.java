/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maths;

/**
 *
 * @author Rammbuda Zwonaka
 */
import java.util.Scanner;
public class Maths{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //application of the quadratic equation
        Scanner input=new Scanner(System.in);
        System.out.println("enter the value of a");
        double a=input.nextDouble();
        
        System.out.println("enter the value of b");
        double b=input.nextDouble();
        
        System.out.println("enter the value of c");
        double c=input.nextDouble();
        double D=Math.sqrt(b*b-4*a*c);
       
          if(D>0){
        double X1=(-b+D)/(2*a);
        double X2=(-b-D)/(2*a);
        System.out.println("Roots are real"+"the roots are "+X1+" and "+X2);}
        
        else if(D==0){
        double X1=(-b+D)/(2*a);
        double X2=(-b-D)/(2*a);
        System.out.println("Roots are real and equal "+" the roots are "+X1+" and "+X2);}
        
        else{System.out.println("syntax error");}
    }
        
     }




