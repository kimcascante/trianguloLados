package Semana10;
/**
 * Nombre del programa: 
 * Descripcion: Haga una función que, dado dos lados de un triángulo, calcule la hipotenusa. Pruébela en un
main
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej2w10 {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream out = System.out;

    public static void main(String[] args) throws IOException{ 
        
        calcularHipotenusa();
    }

    public static void calcularHipotenusa() throws IOException{
        double cateto1;
        double cateto2;
        double hipotenusa;

        out.println("Digite la medida del cateto 1:");
        cateto1 = Double.parseDouble(in.readLine());

        out.println("Digite la medida del cateto 2:");
        cateto2 = Double.parseDouble(in.readLine());

        //hipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2);
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        out.println("La hipotenusa es: " +hipotenusa);
    }
}