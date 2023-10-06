import java.util.Scanner;
import java.util.Optional;

import tools.Display;
import tools.Os;

import farm.Perro;
import school.Profesor;
import concessionaire.Taxi;
import concessionaire.Bus;
import university.TeacherHour;
import university.StudentMagister;
import university.StudentUndergraduate;
import process.ProcessManagement;
import process.ProcessShortTerm;
import process.ProcessLongTerm;

public class Main {

    /* Declaración de atributos */
    private static Scanner option = new Scanner(System.in);
    private static Scanner subOption = new Scanner(System.in);

    private static Object[][] menu = {
        {1,"POO",
            new Object[][]{
                {1,"Granja",},
                {2,"Escuela"},
                {3,"Concesionario"},
                {4,"University"},
                {5,"Procesos"},
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

            //POO
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

                    //Granja
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
   
                    //Escuela
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

                    //Concesionario
                    case 3:
                        //Limpiar la consola
                        Os.clear();

                        //Imprimir la cabecera del aplicativo
                        Display.header("Ha elegido Concesionario");

                        //Instanciar un objeto de tipo Taxi
                        Taxi taxi = new Taxi("ABC123","Chevrolet",200,"2015");

                        Display.lineContent("Informacion Taxi", Optional.of("/"), Optional.of("double"));

                        //Obtener la informacion del Taxi
                        taxi.getData();

                        //Instanciamiento clase bus
                        Bus bus = new Bus("DEF456","Mercedes Benz",300,100);

                        //Titulo divisor de contenido
                        Display.lineContent("Informacion Bus", Optional.of("/"), Optional.of("double"));

                        //Obtener la informacion del Bus
                        bus.getData();

                        //Imprimir el pie de página
                        Display.footer();
                    break;
                     
                    case 4:
                        //Limpiar la consola
                        Os.clear();

                        //Imprimir la cabecera del aplicativo
                        Display.header("Ha elegido Universidad");

                        //Instanciar la clase TeacherHour
                        TeacherHour teacherHour = new TeacherHour("A123456789", "Pepito Perez", "Contabilidad",10);

                        //Titulo divisor de contenido
                        Display.lineContent("Informacion del Docente", Optional.of("/"), Optional.of("double"));

                        //Obtener la informacion del docente
                        teacherHour.getData();

                        //Instanciar la clase correspondiente
                        StudentMagister studentMagister = new StudentMagister("A23456789","Juanito Rodriguez","UNAD","Si");

                        Display.lineContent("Informacion del Estudiante de Maestria", Optional.of("/"), Optional.of("double"));

                        //Obtener la informacion del estudiante
                        studentMagister.getData();

                        //Instanciar la clase correspondiente
                        StudentUndergraduate studentUndergraduate = new StudentUndergraduate("A345678901","Luiz Rodriguez","Politecnico Internacional","Administracion de empresas");

                        Display.lineContent("Informacion del Estudiante de Pregrado", Optional.of("/"), Optional.of("double"));

                        //Objener la infomrmaicon del estudiante
                        studentUndergraduate.getData();

                        Display.footer();
                    break;

                    case 5:
                        //Limpiar la consola
                        Os.clear();

                        //Imprimir la cabecera del aplicativo
                        Display.header("Ha elegido Procesos");

                        //Instanciar la clase correspondiente
                        ProcessManagement processManagement = new ProcessManagement();

                        Display.lineContent("Lista de Procesos", Optional.of("="), Optional.of("double"));

                        //Instanciar la clase correspondiente
                        ProcessShortTerm processShortTerm = new ProcessShortTerm(1,"Proceso 1",1,10);

                        //Instanciar la clase correspondiente
                        ProcessLongTerm processLongTerm = new ProcessLongTerm(2,"Proceso 2",2,"Requisitos");

                        //Añadir procesos a la lista
                        processManagement.addProcess(processShortTerm);
                        processManagement.addProcess(processLongTerm);

                        //Mostrar procesos
                        processManagement.showProcesses();

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