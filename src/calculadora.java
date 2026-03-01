import java.util.Scanner;

public class calculadora {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;
        int resultado;

        System.out.print(" ingrese el primer numero ");
        numero1 = sc.nextInt();

        System.out.print("ingresa el segundo numero ");
        numero2 = sc.nextInt();

        resultado = numero1 + numero2;

        System.out.println("la suma es:" + resultado);

        sc.close();
    }
}