public class Main {
    public static void main(String[] args) {
        // Son estructuras que nos ayudan a "decidir" entra dos o más opciones acerca de qué opción tomar
        // if - else

        // Ejemplo
        /* Quieres ir a una fiesta pero debes hacer tu tarea primero
        --Puedes ir a la fiesta?
        Condición: Debes hacer tu tarea primero
         */
        boolean tarea = false;

        if(tarea == true){
            System.out.println("Puedes salir a la fiesta");
        } else {
            System.out.println("No puedes salir a la fiesta");
        }

        /* Estructuras condicionales simples:
            -- Únicamente una parte tiene instrucciones
                if(){
                }
           Estructuras condicionales complejas:
           -- Tienes instrucciones se se cumple la condición como sino se cumple la condición
           if -- else
         */

        // Ejemplo para saber si un alumno aprobó o no, con un mínimo de 6

        float matematicas = 5;
        float biologia = 7;
        float quimica = 9;
        float promedio = 0;

        promedio = (matematicas + biologia + quimica) / 3;

        if( promedio >= 6 ){
            System.out.println("El alumno aprobó con " + promedio);
        } else {
            System.out.println("El alumno reprobó con " + promedio);
        }
    }
}