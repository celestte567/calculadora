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

   public static int mostraMenus(Scanner sc){
       System.out.println("1.sumar");
       System.out.println("2.restar");
       System.out.println("3.multiplicacion");
       System.out.println("4.dividir");
       System.out.println("5.salir");
       System.out.println("selecione una opcion");

       return Integer.parseInt(sc.nextLine());
   }

   public static int LeerNumero(Scanner sc, String mensaje){
       int numero = 0;
       boolean numeroValido = false;

       do {
           System.out.println(mensaje);
           try {
               numero = Integer.parseInt(sc.nextLine());
               numeroValido = true;
           }catch (NumberFormatException e) {
               System.out.println("ingreso un numero incorrecto. vuelva a ingresar un numero valido ");
           }
       } while (!numeroValido);
       return numero;
   }



   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       String continuar = "s";
       boolean salir = false;


       do {
           int opcion = mostraMenus(sc);

           if (opcion == 5) {
               System.out.println("saliendo del prgrama");
               salir = true;
               continue;
           }

           int numero1 = LeerNumero(sc, "ingresar el primer numero");
           int numero2 = LeerNumero(sc, "ingresar el segundo numero");

           switch (opcion) {
               case 1:
                   System.out.println(" la suma es:" + sumar(numero1, numero2));
                   break;
               case 2:
                   System.out.println("la resta es :" + restar(numero1, numero2));
                   break;
               case 3:
                   System.out.println("la multiplicacion es:" + multiplicar(numero1, numero2));
                   break;
               case 4:
                   if (numero2 != 0) {
                       System.out.println("la divicion es" + dividir(numero1, numero2));
                   } else {
                       System.out.println("no se puede dividier entre 0");
                   }
                   break;

               default:
                   System.out.println("opcion invilida");
           }
           System.out.println("Desea continuar (s/n)");
           continuar = sc.nextLine(). toLowerCase();

           if (!continuar.equals("s")) {
               salir = true;
           }

       }while (!salir);

       sc.close();
   }

}

