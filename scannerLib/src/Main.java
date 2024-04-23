// librería: conjunto de códigos escritos por alguien más que nos facilitan distintas tareas
// Debemos imortar las librerías siempre al principio de nuestros programas

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Objeto de escaner donde van a caer los datos

        String nombre = "";
        int numUno = 0, numDos = 0, resultado = 0;

        System.out.println("Escribe tu nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Escribe el primer numero: ");
        numUno = entrada.nextInt();
        System.out.println("Escribe el segundo numero: ");
        numDos = entrada.nextInt();

        resultado = numUno + numDos;

        System.out.println("Hola " + nombre + " el resultado de la suma es " + resultado);

        entrada.close(); // Se cierra el objeto Scanner para liberar recursos del sistema
    }
}