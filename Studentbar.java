/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentbar;

/**
 *
 * @author Rammbuda Zwonaka,Ramasimu Akonaho and Makhubele Risima
 */
import java.util.Scanner;
public class Studentbar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        
        System.out.println("Are you a student?, yes or no?");
        String student =input.nextLine();
        
       if(student.equals("yes")){
           System.out.println("are you 18 or older?, yes or no?");
           String age=input.nextLine();
           if(age.equals("yes")){
               System.out.println("Access granted");}
           else{System.out.println("Access denied");}
       }
       else{System.out.println("Access denied");}
           }
}

     
     
    
