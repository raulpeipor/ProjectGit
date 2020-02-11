/*
SUBPROGRAMAS METODOS: FUNCIONES + PROCEDIMIENTOS
CONVERSIONES
*/
package p17;

import java.util.Scanner;


public class P17 {

     static Scanner keyboard = new Scanner(System.in);
   
     public static void main(String[] args) {
      keyboard.useDelimiter("\n");

 int euro;
 float dolars;

        int option = -1;

 
        while (option != 0) {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {//switch
                
                
                case 1:
                     p1();
                    System.out.println("Euros");
                    euro = keyboard.nextInt();
                    dolars = functionRaul(euro);
                    System.out.println(dolars);
                  
                    break;

 

                case 2:
              
                    break;

 

                case 3:
                    p3();
                    break;

 

                case 4:
                    p4();
                    break;

 

                case 5:
                    p5();
                    break;

 

                case 6:
                    p6();
                    break;

 

                case 7:
                    p7();
                    break;

 

                case 8:
                    p8();
                    break;

 

                case 9:
                    p9();
                    break;

 

                case 10:
                    p10();
                    break;

 

                default:
                    System.out.println("Invalid Option");
            }//end witch
        }

 

    }

 

    private static void userMenu() {
        System.out.println("");
        System.out.println("Choose one exercise:");
        System.out.println("--Exercise 1--");
        System.out.println("--Exercise 2--");
        System.out.println("--Exercise 3--");
        System.out.println("--Exercise 4--");
        System.out.println("--Exercise 5--");
        System.out.println("--Exercise 6--");
        System.out.println("--Exercise 7--");
        System.out.println("--Exercise 8--");
        System.out.println("--Exercise 9--");
        System.out.println("--Exercise 10--");
    }

    private static float functionRaul(int euro) {
         return 0; 
    }
    private static void p1() {
        
    }

    private static void p2() {
       
    }

    private static void p3() {
       
    }

    private static void p4() {
      
    }

    private static void p5() {
        
    }

    private static void p6() {
       
    }

    private static void p7() {
       
    }

    private static void p8() {
        
    }

    private static void p9() {
       
    }

    private static void p10() {
        
    }

    
}