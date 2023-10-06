import java.util.Scanner;
import tools.Display;

public class Main {

    /* Declaración de atributos */
    private static Scanner option = new Scanner(System.in);
    private static Object[][] menu = {
        {1,"POO",
            new Object[][]{
                {1,"Granja"},
                {2,"Escuela"}
            }
        }
    };

    public static void main(String[] args) {

        Display.header("Seleccione una opción");

        System.out.print("Opción: ");
        int option = Main.option.nextInt();
        switch (option) {
            case 1:
                System.out.println("POO");
                break;
            case 2:
                System.out.println("Escuela");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}