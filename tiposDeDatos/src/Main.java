public class Main {
    public static void main(String[] args) {
        System.out.println("Tipos de datos");
        System.out.println("Enteros: \n byte (-128 a 127) \n short (-32768 a 32767) \n int (-2147483648 a 2147483647) \n long (muy grande) ");
        System.out.println("Decimales: \n float (Hasta 8 valores después del punto \n double (Hasta 15 valores después del punto)");
        System.out.println("Otros: \n char (Un solo caracter) \n boolean (true o false)");
        System.out.println("Tipo objeto: \n String (cadenas de texto) (Hay que invocarlos)");

        System.out.println("\nVariables");
        System.out.println("Los nombre no pueden iniciar con números, puedes usar el camelCase");
        System.out.println("Primero le pones el tipo de dato, luego el nombre y puedes proceder a guardar un valor");
        System.out.println("Ejemplo de un programa de suma: \n");

        int numUno = 5;
        int numDos = 7;
        int resultado = 0; // Se inicializa la variable para que el programa no tenga errores para que no tenga "nada" al iniciar

        resultado = numUno + numDos;

        System.out.println("El resultado de la suma de " + numUno + " más " + numDos + " es: " + resultado);

    }
}