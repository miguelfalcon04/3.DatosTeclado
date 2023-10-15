/*Ejercicio 12
Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%.
*/

import java.util.Scanner;
public class Eje12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la nota del primer examen: ");
        float n1 = Float.parseFloat(sc.nextLine());

        System.out.print("¿Qué nota quieres sacar en el trimestre? ");
        float notaDeseada = Float.parseFloat(sc.nextLine());

        System.out.printf("Para tener un %.2f en el trimestre necesitas sacar un %.2f en el segundo examen",notaDeseada,(((notaDeseada*100)-(n1*40))/60));
        sc.close();
    }
}
