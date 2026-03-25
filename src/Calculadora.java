import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        if (b == 0) throw new ArithmeticException("No se puede dividir entre 0.");
        return (double) a / b;
    }

    public static Object leerValor(Scanner sc, Class<?> type) {
        String input = sc.nextLine().trim();
        try {
            if (type.equals(Integer.class) || type.equals(int.class))
                return Integer.parseInt(input);
            if (type.equals(Double.class) || type.equals(double.class))
                return Double.parseDouble(input);
            if (type.equals(Boolean.class) || type.equals(boolean.class)) {
                if (input.equalsIgnoreCase("true"))  return true;
                if (input.equalsIgnoreCase("false")) return false;
                throw new InputMismatchException("Se esperaba 'true' o 'false'.");
            }
            if (type.equals(String.class)) return input;

        } catch (NumberFormatException e) {
            throw new InputMismatchException(
                    "El valor '" + input + "' no coincide con el tipo esperado: " + type.getSimpleName()
            );
        }
        throw new InputMismatchException("Tipo no soportado: " + type.getName());
    }

    public static int leerNumero(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return (int) leerValor(sc, int.class);
            } catch (InputMismatchException e) {
                System.out.println("Número incorrecto, vuelva a intentarlo.");
            }
        }
    }

    public static boolean preguntarContinuar(Scanner sc) {
        while (true) {
            System.out.print("\n¿Desea continuar? (S/n): ");
            String respuesta = leerValor(sc, String.class).toString().toLowerCase();
            if (respuesta.isEmpty() || respuesta.equals("s")) return true;
            if (respuesta.equals("n")) return false;
            System.out.println("Opción no válida. Ingrese 'S' para continuar o 'n' para salir.");
        }
    }

    public static void mostrarMenu() {
        System.out.println("\n---------------------------");
        System.out.println("0. Salir");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("---------------------------");
        System.out.println("Seleccione una opción: ");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean continuar = true;
            while (continuar) {
                mostrarMenu();
                int opcion;
                try {
                    opcion = (int) leerValor(sc, int.class);
                }catch (InputMismatchException e){
                    System.out.println("Opción inválida, por favor ingrese un número.");
                    continue;
                }

                if (opcion == 0) {
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                }

                if (opcion < 1 || opcion > 4) {
                    System.out.println("Opción inválida, elija entre 0 y 4.");
                    continue; // Volver al menú sin pedir números
                }

                int numero1 = leerNumero(sc, "Ingrese el primer número: ");
                int numero2 = leerNumero(sc, "Ingrese el segundo número: ");

                switch (opcion) {
                    case 1 -> System.out.println("Resultado: " + sumar(numero1, numero2));
                    case 2 -> System.out.println("Resultado: " + restar(numero1, numero2));
                    case 3 -> System.out.println("Resultado: " + multiplicar(numero1, numero2));
                    case 4 -> {
                        try {
                            System.out.println("Resultado: " + dividir(numero1, numero2));
                        } catch (ArithmeticException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                }

                continuar = preguntarContinuar(sc);
            }
        }
    }
}