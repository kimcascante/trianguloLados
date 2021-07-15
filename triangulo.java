package Semana4;

/**
 * Nombre del programa: 
 * Descripcion: A usted se le pide que realice un programa que, recibiendo la medida de tres lados, se
    imprima si estos tres lados pueden formar un triángulo. Tres lados forman un triángulo
    si la suma de dos lados de un triángulo siempre es mayor al tercer lado. Por ejemplo, si
    tenemos un lado a que mide 7, un lado b que mide 10 y un lado c que mide 5, se compara
    si la suma de los lados b y c es mayor que la medida del lado a. Luego si la suma de
    los lados a y b es mayor que la medida del lado c y, finalmente, si la suma del lado a y
    c es mayor que la medida del lado b. Si las tres condiciones se cumplen, entonces los
    tres lados conforman un triángulo
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej2w4 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 
        int ladoUno;
        int ladoDos;
        int ladoTres;
        int sumaLados;
        String triangulo;

        escribir.println("Digite la medida del lado uno:");
        ladoUno = Integer.parseInt(leer.readLine());

        escribir.println("Digite la medida del lado dos:");
        ladoDos = Integer.parseInt(leer.readLine());

        escribir.println("Digite la medida del lado tres:");
        ladoTres = Integer.parseInt(leer.readLine());

        sumaLados = ladoDos + ladoUno;

        if (sumaLados > ladoTres){
            triangulo = "Si se puede formar un triangulo";
        } else {
            triangulo = "No se puede formar un triangulo";
        }

        escribir.println(triangulo);
    }
}