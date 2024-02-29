/*
 * A la mamá de Juan le preguntan su edad, y contesta: tengo 3 hijos, pregúntele a Juan su
   edad. Alberto tiene 2/3 de la edad de Juan, Ana tiene 4/3 de la edad de Juan y mi edad es
   la suma de las tres. Hacer un algoritmo que muestre la edad de los cuatro.
*/
package ejercicioenjavaun;

import java.util.Scanner;

public class EjercicioEnJavaUN {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // definicion de variables:
        int edadJuan;
        int edadAlberto; 
        int edadAna; 
        int edadMama;
        
        // Solicitar la edad de Juan
        System.out.print("Ingrese la edad de Juan: ");
        edadJuan = scanner.nextInt();

        // Calcular la edad de Alberto
        edadAlberto = (2 * edadJuan) / 3;

        // Calcular la edad de Ana
        edadAna = (4 * edadJuan) / 3;

        // Calcular la edad de la mamá (suma de las tres edades)
        edadMama = edadJuan + edadAlberto + edadAna;

        // Mostrar los resultados
        System.out.println("Las edades son: \nAlberto: " +edadAlberto+ " Juan: " +edadJuan+ " Ana: " +edadAna+ " Mamá: " +edadMama);
        
    }
    
}
