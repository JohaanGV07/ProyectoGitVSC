import java.util.Scanner;
public class Saludo{

  public static void main(String[]args){
    Scanner teclado= new Scanner (System.in);
System.out.println("Dame tu nombre");
    String nombre=teclado.nextLine();

    System.out.println("Hola " + nombre + " espero te encuentres bien");

  System.out.println("Adios " + nombre + " ha sido un placer conocerte");

    teclado.close();

    
  }


  
}
