/*Ejercicio 11
Realiza un conversor de Kb a Mb.
*/

import java.util.Scanner;
public class Eje11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca los Kb a convertir: ");
        float kb = Float.parseFloat(sc.nextLine());

        System.out.printf("%.2f Kb son %.2f Mb",kb,(float)(kb/1000));

        sc.close();
    }
}
