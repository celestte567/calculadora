import java.util.Scanner;

public class calculadora {


   public static int restar(int a, int b){
       return a - b;
   }

   public static int sumar(int a, int b){
       return a + b;
   }

   public static int multiplicar(int a, int b){
       return a * b;
   }

   public static double dividir(int a, int b){

       if(b == 0){
           throw new ArithmeticException("no se puede dividir entr 0");
       }

       return (double) a / b;
   }

   public enum Operaciones{
       SUMA,
       RESTA,
       MULTIPLICACION,
       DIVISIO
   }

}

