//Importancion de Paqueteria
import functions.styles;
import functions.os;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Arreglo contendor de las opciones disponibles
        Object[][] menu={
            {1,"POO",
                new Object[][]{
                    {1,"Granja"},
                    {2,"Escuela"}
                }
            }
        };

        //Instanciamiento de la clase Scanner
        Scanner input = new Scanner(System.in);

        //Imprimir mensaje de bienvenida
        System.out.println(styles.printLitle("Bienvenido al sistema de aprendizaje",Optional.empty()));

        System.out.println(styles.printLitle("Seleccione una tematica",Optional.of(true)));

        //Mostrado del menu de opciones
        for(int i=0;i<menu.length;i++){
            System.out.println("  "+menu[i][0]+". "+menu[i][1]);
        };

        //Salto de linea
        System.out.println("\r");

        //Ingreso de la opcion
        System.out.print("Opcion: ");
        int opcion = input.nextInt();

        System.out.println(opcion);
        os.clear();

        //Cerrar el objeto de tipo Scanner
        input.close();
    }
}