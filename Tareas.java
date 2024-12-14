import java.util.Scanner;

public class Tareas{
public static void main(String[] args) {
    
System.out.println("Tareas");
System.out.println("1. Lavar la ropa");
System.out.println("2.Comprar comida");
System.out.println("3. Hacer deberes");
System.out.println("4. Limpiar la habitación");

Scanner teclado= new Scanner(System.in);

System.out.println("Elige la tarea");
int tarea=teclado.nextInt();

String eleccion="";

switch (tarea) {
    
    case 1: eleccion="Lavar la ropa";
     System.out.println("Has elegido:" + eleccion);
        break;

    case 2: eleccion="Comprar comida";
    System.out.println(" Has elegido: " + eleccion);
        break;

        case 3: eleccion="Hacer deberes";
        System.out.println(" Has elegido: " + eleccion);
        break;


        case 4: eleccion="Limpiar habitacion";
        System.out.println(" Has elegido: " + eleccion);
        break;
}

}


}