
import java.util.Scanner;

public class Main{

          public static void main(String[] arg){

                   Scanner num = new Scanner (System.in);
                   int digito1;
                   int digito2;
                   int op; 
                   do{

                   System.out.println("Ejercicio 1 ");
                   System.out.println("");
                   System.out.println(" Este programa le ayudara a determinar si un numero es mayor menor o igual que otro");


                       System.out.println("Digite el primer numero");
                       digito1 = num.nextInt();
                   
                       System.out.println("Digite el segundo numero");
                       digito2 = num.nextInt();
                           
                           if(digito1 == digito2){

                               System.out.println(" Ambos numeros son iguales ")  ;
                           
                           }
                            
                           if (digito1 > digito2){

                                    
                                   System.out.println("El numero mayor es el"+digito1 ) ;


                           }  
                             if(digito2 > digito1) {

                                   System.out.println("El numero mayor es el"+digito2)  ;

                            }

                                System.out.println("desea comparar otro numero?");
                                System.out.println("1. Si");
                                System.out.println("2. No");

                                op = num.nextInt();   


                         }while(op==2);
  
                           System.out.println("MUCHAS GRACIAS POR UTILIZAR ESTE SOFTWARE");

           }

}