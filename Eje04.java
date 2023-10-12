/*Ejercicio 4
Escribe un programa que sume, reste, multiplique y divida dos números
introducidos por teclado. 
*/

import java.util.Scanner;

public class Eje04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;

        System.out.print("Introduce el primer número: ");
        n1 = Integer.parseInt(sc.nextLine());

        System.out.print("Introduce el segundo número: ");
        n2 = Integer.parseInt(sc.nextLine());

        System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
        System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
        System.out.println(n1 + " x " + n2 + " = " + (n1*n2));
        System.out.println(n1 + " / " + n2 + " = " + n1/n2);

        sc.close();
    }
}
