
import java.util.Scanner;

/* programa que calclula a potência de 0 até 15
 */

/**
 *
 * 
 */
public class Potencia_java {

 
    public static void main(String[] args) 
    {
     Scanner leitor = new Scanner(System.in);
     
     int num,resp, i;
      
     System.out.println("Digite o valor:");  
     num = leitor.nextInt();
     
     for (i=0;i<=15;i++)
     {
        
         resp= (int) Math.pow(num,i);
         System.out.println(num + " ^ " + " = " + resp);
     }
    }
    
}
