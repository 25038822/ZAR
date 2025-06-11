/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primenumbers;

import java.util.Scanner;

/**
 *
 * @author Rammbuda Zwonaka
 */
public class Primenumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("enter the value of n");
        int n= input.nextInt();
        int k=0;
        for(int i=1;i<=n;i++){
            double rem=n%i++;
            if(rem>0 ){
                System.out.print("is not a prime number");
                
            }else{
            System.out.println("is prime");
            }
        }
    }
}
    

           
    



