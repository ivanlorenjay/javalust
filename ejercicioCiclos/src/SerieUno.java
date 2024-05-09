public class SerieUno {
    public static void main(String[] args){
        // Serie 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

       int i = 0;
       System.out.println("Ciclo for");

       for(i = 1; i <= 10; i++){
           if(i < 10){
               System.out.print(i + ", ");
           } else {
               System.out.print(i);
           }
       }

       System.out.println("\nCiclo while");

       i = 1;
       while (i <= 10){
           if(i < 10){
               System.out.print(i + ", ");
           } else {
               System.out.print(i);
           }

           i++;
       }

       System.out.println("\nCiclo do-while");
       i = 1;
       do{
           if(i < 10){
               System.out.print(i + ", ");
           } else {
               System.out.print(i);
           }

           i++;
       }while(i <= 10);
    }
}
