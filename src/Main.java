import java.util.Scanner;
import java.util.Optional;

import tools.Display;
import tools.Os;

import poo.farm.Perro;
import poo.school.Profesor;
import poo.concessionaire.Taxi;
import poo.concessionaire.Bus;
import poo.university.TeacherHour;
import poo.university.StudentMagister;
import poo.university.StudentUndergraduate;
import poo.process.ProcessManagement;
import poo.process.ProcessShortTerm;
import poo.process.ProcessLongTerm;

import abstract_class.artimetic.Aritmetic;
import abstract_class.geometry.Square;
import abstract_class.geometry.Triangle;

import exceptions.try_manage.Manager;

public class Main {

    /* Declaración de atributos */

        /* Scanners */
            private static Scanner option = new Scanner(System.in);
            private static Scanner subOption = new Scanner(System.in);
            private static Scanner data = new Scanner(System.in);
        //

        /* Valores Scanners */
            private static int valueOption;
            private static int valueSubOption;
        //
    //

    private static Object[][] menu = {
        {1,"POO",
            new Object[][]{
                {1,"Granja",},
                {2,"Escuela"},
                {3,"Concesionario"},
                {4,"University"},
                {5,"Procesos"},
            }
        },
        {2,"Clases abstractas",
            new Object[][]{
                {1,"Aritmetica"}
            }
        },
        {3,"Colecciones",
            new Object[][]{

            }
        },
        {4,"Excepciones",
            new Object[][]{
                {1,"Gestionar"}
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
        valueOption = Main.option.nextInt();

        switch (valueOption) {

            //POO
            case 1:
                //Limpiar la consola
                Os.clear();

                //Imprimir la cabecera del aplicativo
                Display.header("Ha elegido POO");              

                //Imprimir el submenú
                for (Object[] subMenu : (Object[][]) menu[valueOption - 1][2]) {

                    Display.lineContent(subMenu[0] +  "." + subMenu[1],Optional.empty(),Optional.empty());
                }

                System.out.print("Opción: ");
                valueSubOption = Main.subOption.nextInt();

                switch (valueSubOption) {

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

            //Clases abstractas
            case 2:
                //Limpiar la consola
                Os.clear();

                //Imprimir la cabecera del aplicativo
                Display.header("Ha elegido Clases abstractas");

                //Imprimir el submenú
                for (Object[] subMenu : (Object[][]) menu[valueOption - 1][2]) {

                    Display.lineContent(subMenu[0] +  "." + subMenu[1],Optional.empty(),Optional.empty());
                }

                System.out.print("Opción: ");
                valueSubOption = Main.subOption.nextInt();

                //Ejecucion del ejercicio selccionado
                switch(valueSubOption){
                    
                    //Aritmetica
                    case 1:

                        //Limpiar la consola
                        Os.clear();

                        //Imprimir la cabecera del aplicativo
                        Display.header("Ha elegido Aritmetica");

                        System.out.print("Primer Numero: ");
                        int num_1 = Main.data.nextInt();

                        System.out.print("Segundo Numero: ");
                        int num_2 = Main.data.nextInt();

                        //Instanciar la clase correspondiente
                        Aritmetic mathBook = new Aritmetic(num_1, num_2);

                        //Imprimir la Suma de los numeros
                        Display.lineContent(mathBook.showSum(), Optional.empty(), Optional.of("up"));

                        //Imprimir la Resta de los numeros
                        Display.lineContent(mathBook.showRest(), Optional.empty(), Optional.empty());

                        //Imprimir pie de Pagina
                        Display.footer();
                    break;

                    //Geometria
                    case 2:
                        //Limpiar la consola
                        Os.clear();

                        //Imprimir la cabecera del aplicativo
                        Display.header("Ha elegido Geometria");

                        Display.lineContent("Seleccione una figura", Optional.empty(), Optional.of("double"));

                        Display.lineContent("1. Cuadrado", Optional.empty(), Optional.of("up"));
                        Display.lineContent("2. Triangulo", Optional.empty(), Optional.of("down"));

                        System.out.print("Opción: ");
                        int figure = Main.subOption.nextInt();

                        switch(figure){
                            case 1:
                                //Limpiar la consola
                                Os.clear();

                                //Imprimir la cabecera del aplicativo
                                Display.header("Ha elegido Cuadrado");

                                System.out.print("Lado: ");
                                int side = Main.data.nextInt();

                                //Instanciar la clase correspondiente
                                Square square = new Square(side);

                                //Imprimir el area del cuadrado
                                Display.lineContent(square.area(), Optional.empty(), Optional.of("up"));

                                //Imprimir pie de Pagina
                                Display.footer();
                            break;

                            case 2:
                                //Limpiar la consola
                                Os.clear();

                                //Imprimir la cabecera del aplicativo
                                Display.header("Ha elegido Triangulo");

                                System.out.print("Base: ");
                                int base = Main.data.nextInt();

                                System.out.print("Altura: ");
                                int height = Main.data.nextInt();

                                //Instanciar la clase correspondiente
                                Triangle triangle = new Triangle(3, base, height)

                                //Imprimir el area del triangulo
                                Display.lineContent(triangle.area(), Optional.empty(), Optional.of("up"));

                                //Imprimir pie de Pagina
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
            break;

            //Colecciones
            case 3:
                //Limpiar la consola
                Os.clear();

                //Imprimir la cabecera del aplicativo
                Display.header("Ha elegido Colecciones");

                Display.footer();
            break;

            //Excepciones
            case 4:
                //Limpiar la consola
                Os.clear();

                //Imprimir la cabecera del aplicativo
                Display.header("Ha elegido Excepciones");

                //Imprimir el submenú
                for (Object[] subMenu : (Object[][]) menu[valueOption - 1][2]) {

                    Display.lineContent(subMenu[0] +  "." + subMenu[1],Optional.empty(),Optional.empty());
                }

                System.out.print("Opción: ");
                int subOption4 = Main.subOption.nextInt();

                switch (subOption4) {
                    case 1:
                        //Limpiar la consola
                        Os.clear();

                        //Imprimir la cabecera del aplicativo
                        Display.header("Ha elegido Gestionar Excepciones");

                        //Instanciar la clase correspondiente
                        Manager manager = new Manager();

                        //Subtitulo
                        Display.lineContent("Ingresar Textos a una lista", Optional.empty(), Optional.of("up"));

                        //Complemento del Subtitulo
                        Display.lineContent("Para dejar de añadir, escribe null", Optional.empty(), Optional.of("down"));  

                        //Variable de control
                        boolean control = true;

                        //Permitir la adicion de textos hasta que se ingrese null
                        while(control){
                            String value = Main.data.nextLine();
                            
                            if(value == "null"){
                                System.out.println("Entro");
                            }else{
                                manager.addText(value);
                            }
                        }
                        
                        manager.showTexts();
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