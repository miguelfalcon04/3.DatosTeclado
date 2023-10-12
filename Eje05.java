/*Ejercicio 5
Escribe un programa que calcule el área de un rectángulo.
*/

import java.util.Scanner;
public class Eje05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el largo: ");
        int largo = Integer.parseInt(sc.nextLine());

        System.out.print("Introduzca el ancho: ");
        int ancho = Integer.parseInt(sc.nextLine());

        System.out.print("Área = "+(ancho*largo));

        sc.close();
    }
}
