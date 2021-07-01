import java.util.Scanner;

public class clase01 {
    /*EJERCICIO 1 OPCION 1
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dame tu nombre");
        String nombre = scan.nextLine();
        System.out.println("Hola "+nombre);
    }*/
    /*EJERCICIO 1 OPCION 2*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dame tu nombre: ");
        String nombre = scan.nextLine();
        String finale = saludo(nombre);
        System.out.println(finale);
        system.out.println("Esto es un cambio");
    }
    public static String saludo(String nombre) {
        return ("Hola "+nombre+"!");
    }
} 