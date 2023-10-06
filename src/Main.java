import java.util.Scanner;
import java.util.Optional;

import tools.Display;
import tools.Os;

import granja.Perro;
import escuela.Profesor;

public class Main {

    /* Declaración de atributos */
    private static Scanner option = new Scanner(System.in);
    private static Scanner subOption = new Scanner(System.in);

    private static Object[][] menu = {
        {1,"POO",
            new Object[][]{
                {1,"Granja",},
                {2,"Escuela"}
            }
        }
    };

    public static void main(String[] args) {

        //Limpiar la consola
        Os.clear();

        //Imprimir la cabecera del aplicativo
        Display.header("Seleccione una opción");

        //Imprimir el menu
        for (Object[] option : menu) {
            Display.lineContent(option[0] +  "." + option[1],Optional.empty(),Optional.empty());
        }

        System.out.print("Opción: ");
        int option = Main.option.nextInt();

        switch (option) {
            case 1:

                //Limpiar la consola
                Os.clear();

                //Imprimir la cabecera del aplicativo
                Display.header("Ha elegido POO");              

                //Imprimir el submenú
                for (Object[] subMenu : (Object[][]) menu[option - 1][2]) {

                    Display.lineContent(subMenu[0] +  "." + subMenu[1],Optional.empty(),Optional.empty());
                }

                System.out.print("Opción: ");
                int subOption = Main.subOption.nextInt();

                switch (subOption) {
                    case 1:

                        //Limpiar la consola
                        Os.clear();

                        //Imprimir la cabecera del aplicativo
                        Display.header("Ha elegido Granja");

                        //Instanciar un objeto de tipo Perro
                        Perro perro = new Perro("Firulais","Colombia",4,"Pitbull");

                        //Obtener la informacion del Perro
                        System.out.println("Nombre:" + perro.getNombre());
                        System.out.println("Origen:" + perro.getOrigen());
                        System.out.println("Patas:" + perro.getPatas());
                        System.out.println("Raza:" + perro.getRaza());

                        //Imprimir el pie de página
                        Display.footer();
                    break;

                    case 2:

                        //Limpiar la consola
                        Os.clear();

                        //Imprimir la cabecera del aplicativo
                        Display.header("Ha elegido Escuela");

                        //Instanciar un objeto de tipo Profesor
                        Profesor profesor = new Profesor("Juan","Perez",30,"123456789");

                        //Obtener la informacion del Profesor
                        profesor.getData();

                        //Imprimir el pie de página
                        Display.footer();
                    break;
                
                    default:
                        Display.lineContent("Opcion Invalida", Optional.of("="), Optional.of("double"));
                    break;
                }
            break;

            default:
                Display.lineContent("Opcion Invalida", Optional.of("="), Optional.of("double"));

            break;
        }
    }
}