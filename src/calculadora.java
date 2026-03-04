import java.util.Scanner;

public class calculadora {


    public static int sumar(int a , int b){
        return a + b;
    }

    public static int leerNumero(Scanner sc, String mensaje){
        int numero = 0;
        boolean numeroValido = false;

        do {
            System.out.print(mensaje);
            try {
                numero = Integer.parseInt(sc.nextLine());
                numeroValido = true;
            } catch (NumberFormatException e) {
                System.out.println("ingreso un numero incorrecto, vuelva a ingresar el numero correcto");
            }
        } while (!numeroValido);
        return numero;
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
       int numero1 = leerNumero(sc, "ingresar el primer numero ");
       int numero2 = leerNumero(sc, "ingresar el segundo numero");

       int resultado = sumar(numero1, numero2);

       System.out.println("la suma es" + resultado);

       sc.close();
    }
}

