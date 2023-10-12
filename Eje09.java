/*Ejercicio 9
Escribe un programa que calcule el volumen de un cono según la fórmula V =
1/3πr^2h 
*/

import java.util.Scanner;
public class Eje09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Radio del cono: ");
        float r = Float.parseFloat(sc.nextLine());

        System.out.print("Altura del cono: ");
        float h = Float.parseFloat(sc.nextLine());

        System.out.printf("el volumen del cono es: %.2f" , (((1.0/3.0)*(Math.PI)*(Math.pow(r, 2))*(h))));
        sc.close();
    }
}
