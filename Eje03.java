/*Ejercicio 3
Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
convertir debe ser introducida por teclado.
*/

import java.util.Scanner;
public class Eje03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pesetas;

        System.out.print("Pesetas a convertir: ");
        pesetas = Float.parseFloat(sc.nextLine());

        System.out.println(pesetas + " pesetas son " + (pesetas*0.006 ) + " en euros");
        sc.close();
    }
}
