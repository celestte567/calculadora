import java.util.Scanner;

public class calculadora {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        int numero1 = 0;
        int numero2 = 0;
        int resultado;
        boolean NumeroValido = false;


        do {
            System.out.print(" ingrese el primer numero ");
            try {
                numero1 = Integer.parseInt(sc.nextLine());
                NumeroValido = true;
            } catch (NumberFormatException e) {
                System.out.println("ingreso un numeros incorrecto, vuelva a ingresarlo");
            }
        } while (!NumeroValido);

        NumeroValido = false;

        do {
            System.out.print(" ingrese el segundo numero ");
            try {
                numero2 = Integer.parseInt(sc.nextLine());
                NumeroValido = true;
            } catch (NumberFormatException e) {
                System.out.println("ingreso un numeros incorrecto, vuelva a ingresarlo");
            }
        } while (!NumeroValido);

        resultado = numero1 + numero2;

        System.out.println("la suma es:" + resultado);

        sc.close();
    }
}