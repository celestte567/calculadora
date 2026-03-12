import java.util.Scanner;

public class calculadora {


    public static int sumar(int a , int b){
        return a + b;
    }

    public static int restar(int a, int b) {return  a - b;}

    public static int multiplicar(int a, int b) {return  a * b;}

    public static double dividir(int a, int b) {return (double) a/b;}

    public static int mostrarMenu(Scanner sc){
        System.out.println("----- calculadora----");
        System.out.println("1. sumar");
        System.out.println("2. restar");
        System.out.println("3. multiplicar");
        System.out.println("4. dividir");
        System.out.println("seleccionar una opcion");

        return Integer.parseInt(sc.nextLine());
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = mostrarMenu(sc);

        int numero1 = leerNumero(sc, "ingresar el primer numero");
        int numero2 = leerNumero(sc, "ingresar el segundo numero");

        switch (opcion){
            case 1:
                System.out.println(" la suma es:" + sumar(numero1, numero2));
                break;
            case 2:
                System.out.println("la resta es:" + restar(numero1, numero2));
                break;
            case 3:
                System.out.println("La multiplicacion es:" + multiplicar(numero1, numero2));
                break;
            case 4:
                if(numero2 != 0){
                    System.out.println("la diversion es" + dividir(numero1, numero2));
                }else{
                    System.out.println("no se puede dividir entra 0");
                }
                break;

            default:
                System.out.println("Opcion invilida");
        }
        sc.close();
    }


}

