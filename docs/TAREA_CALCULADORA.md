# 📚 Calculadora Java --- Guía y Tarea Paso a Paso

Java Calculator --- Step‑by‑Step Guide and Task

Esta guía explica **el código actual**, **conceptos básicos de Java**,
**comandos esenciales de Git** y una **tarea paso a paso** para mejorar
la calculadora.

This guide explains the **current code**, **basic Java concepts**,
**essential Git commands**, and a **step‑by‑step task** to improve the
calculator.

El objetivo es aprender:

-   Java básico
-   Control de errores
-   Métodos
-   Enums
-   Switch
-   Uso de Git con commits pequeños

The goal is to learn:

-   Basic Java
-   Error handling
-   Methods
-   Enums
-   Switch
-   Using Git with small commits

------------------------------------------------------------------------

# 🧠 Explicación del Código Actual

Explanation of the Current Code

El programa es una **calculadora simple que suma dos números**.

The program is a **simple calculator that adds two numbers**.

Código original:

``` java
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
```

------------------------------------------------------------------------

# 📦 Import

``` java
import java.util.Scanner;
```

🇪🇸\
Importa la clase `Scanner`, que permite **leer datos del teclado**.

🇺🇸\
Imports the `Scanner` class which allows **reading data from the
keyboard**.

------------------------------------------------------------------------

# 🧱 Clase

``` java
public class calculadora
```

🇪🇸\
Una **clase** es como un contenedor de código.

🇺🇸\
A **class** is like a container for code.

Ejemplo simple:

``` java
public class Persona {
}
```

------------------------------------------------------------------------

# 🔧 Métodos

Un **método** es una función.

A **method** is a function.

Ejemplo:

``` java
public static int sumar(int a, int b){
    return a + b;
}
```

Explicación:

  Parte           Significado
  --------------- -----------------------------------
  public          se puede usar desde otros lugares
  static          pertenece a la clase
  int             tipo de dato que devuelve
  sumar           nombre del método
  (int a,int b)   parámetros

Ejemplo de uso:

``` java
int resultado = sumar(5,3);
```

Resultado:

    8

------------------------------------------------------------------------

# 🔁 do while

``` java
do {
   ...
} while(condicion);
```

🇪🇸\
El código se ejecuta **al menos una vez**.

🇺🇸\
The code runs **at least once**.

Ejemplo:

``` java
int numero = 0;

do{
   numero++;
}while(numero < 5);
```

Resultado:

    1 2 3 4 5

------------------------------------------------------------------------

# ⚠️ Try Catch

Sirve para **evitar que el programa se rompa si ocurre un error**.

Used to **prevent the program from crashing if an error occurs**.

Ejemplo:

``` java
try{
   int numero = Integer.parseInt("hola");
}
catch(NumberFormatException e){
   System.out.println("eso no es un numero");
}
```

Salida:

    eso no es un numero

------------------------------------------------------------------------

# 📥 Scanner

``` java
Scanner sc = new Scanner(System.in);
```

Sirve para **leer texto que escribe el usuario**.

Used to **read user input**.

Ejemplo:

``` java
Scanner sc = new Scanner(System.in);
String nombre = sc.nextLine();
System.out.println(nombre);
```

------------------------------------------------------------------------

# 🚀 Método Main

``` java
public static void main(String[] args)
```

Es el **inicio del programa**.

It is the **start of the program**.

------------------------------------------------------------------------

# 🔄 Flujo del Programa

1 Crear scanner\
2 Leer número 1\
3 Leer número 2\
4 Sumar\
5 Mostrar resultado

------------------------------------------------------------------------

# 🧾 Git --- Comandos Esenciales

## Ver estado

    git status

Muestra archivos modificados.

------------------------------------------------------------------------

## Agregar archivos

    git add .

------------------------------------------------------------------------

## Crear commit

    git commit -m "mensaje"

Ejemplo:

    git commit -m "add subtraction method"

------------------------------------------------------------------------

## Ver historial

    git log

Versión corta:

    git log --oneline

------------------------------------------------------------------------

## Enviar cambios

    git push

------------------------------------------------------------------------

## Descargar cambios

    git fetch

Descarga cambios pero **no los aplica**.

------------------------------------------------------------------------

## Aplicar cambios

    git pull

------------------------------------------------------------------------

# 🧪 Tarea: Mejorar la Calculadora

Vamos a mejorar el programa paso a paso.

Each step should be **a separate commit**.

------------------------------------------------------------------------

# STEP 1 --- Restar

Crear método:

``` java
public static int restar(int a,int b){
    return a - b;
}
```

Ejemplo:

    10 - 3 = 7

Commit:

    git add .
    git commit -m "add subtraction method"

------------------------------------------------------------------------

# STEP 2 --- Multiplicar

Crear:

``` java
public static int multiplicar(int a,int b){
    return a * b;
}
```

Ejemplo:

    4 * 3 = 12

Commit:

    git commit -m "add multiplication method"

------------------------------------------------------------------------

# STEP 3 --- Dividir

Crear:

``` java
public static double dividir(int a,int b){

    if(b == 0){
        throw new ArithmeticException("no se puede dividir entre 0");
    }

    return (double)a / b;
}
```

Ejemplo:

    10 / 2 = 5

Error:

    10 / 0 → ERROR

Commit:

    git commit -m "add division method"

------------------------------------------------------------------------

# STEP 4 --- Crear Enum

Un **enum** representa opciones posibles.

Example:

``` java
public enum Operacion{
    SUMA,
    RESTA,
    MULTIPLICACION,
    DIVISION
}
```

Commit:

    git commit -m "add enum operations"

------------------------------------------------------------------------

# STEP 5 --- Crear menú

Mostrar opciones:

    1 Sumar
    2 Restar
    3 Multiplicar
    4 Dividir

Leer opción del usuario.

Ejemplo:

``` java
int opcion = leerNumero(sc,"elige operacion: ");
```

Commit:

    git commit -m "add menu"

------------------------------------------------------------------------

# STEP 6 --- Usar Switch

``` java
switch(opcion){

case 1:
resultado = sumar(a,b);
break;

case 2:
resultado = restar(a,b);
break;

case 3:
resultado = multiplicar(a,b);
break;

case 4:
resultado = dividir(a,b);
break;

default:
System.out.println("opcion invalida");

}
```

Commit:

    git commit -m "add switch operations"

------------------------------------------------------------------------

# STEP 7 --- Manejar error de división

``` java
try{
   resultado = dividir(a,b);
}
catch(ArithmeticException e){
   System.out.println("no se puede dividir por cero");
}
```

Commit:

    git commit -m "handle division error"

------------------------------------------------------------------------

# 🎯 Objetivo Final

La calculadora debe poder:

✔ sumar\
✔ restar\
✔ multiplicar\
✔ dividir

Y mostrar un menú.

------------------------------------------------------------------------

# 🏁 BONUS

Agregar un loop para repetir.

Ejemplo:

``` java
String continuar;

do{

   // calculadora

   System.out.println("continuar? s/n");
   continuar = sc.nextLine();

}while(continuar.equals("s"));
```

------------------------------------------------------------------------

# 💡 Consejos

Haz commits pequeños.

Ejemplo bueno:

    add subtraction method

Ejemplo malo:

    cambios

------------------------------------------------------------------------

# 📈 Flujo recomendado de Git

Siempre:

    git fetch
    git log --oneline origin/main
    git pull

Luego trabajar.

    git add .
    git commit -m "mensaje"
    git push

------------------------------------------------------------------------

# 🚀 Objetivo del ejercicio

Aprender:

-   Java básico
-   Manejo de errores
-   Git
-   Commits pequeños
