/*Ejercicio 1
Realiza un programa que pida dos números y que luego muestre el resultado
de su multiplicación. 
*/

import java.util.Scanner;
public class Eje01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;

        System.out.print("Introduce el primer número: ");
        n1 = Integer.parseInt(sc.nextLine());

        System.out.print("Introduce el segundo número: ");
        n2 = Integer.parseInt(sc.nextLine());

        System.out.println(n1 + " x " + n2 + " = " + n1*n2);
        sc.close();
    }
}