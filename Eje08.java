/*Ejercicio 8
Escribe un programa que calcule el salario semanal de un empleado en base a
las horas trabajadas, a razón de 12 euros la hora.
*/

import java.util.Scanner;
public class Eje08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Horas trabajadas esta semana: ");
        int horas = Integer.parseInt(sc.nextLine());

        System.out.println("Su salario semanal será de: " + horas*12);
        sc.close();
    }
}
