/*Ejercicio 10
Realiza un conversor de Mb a Kb.
*/

import java.util.Scanner;
public class Eje10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mb a converir: ");
        int mb = Integer.parseInt(sc.nextLine());

        System.out.printf("%d Mb son: %d Kb" , mb , (mb*1000));
        sc.close();
    }
}
