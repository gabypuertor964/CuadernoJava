package process;

import java.util.ArrayList;
import java.util.Optional;

import tools.Display;

public class ProcessManagement{
    
    /* Definicion de atributos */
        private ArrayList<Process> processes;
    //

    /* Metodo constructor */
    public ProcessManagement() {
        this.processes = new ArrayList<Process>();
    }

    /* Metodos generales */

        //Añadir proceso a la lista
        public void addProcess(Process process){
            this.processes.add(process);
        }

        //Eliminar proceso de la lista
        public void removeProcess(Process process){
            this.processes.remove(process);
        }

        //Mostrar procesos
        public void showProcesses(){
            for (Process process : processes) {
                System.out.println("ID: " + process.getId());
                System.out.println("Nombre: " + process.getName());
                System.out.println("Prioridad: " + process.getPriority());

                if (process instanceof ProcessShortTerm) {
                    ProcessShortTerm processShortTermes = (ProcessShortTerm) process;

                    System.out.println("Tiempo de Ejecución: " + processShortTermes.getTime());

                }else if (process instanceof ProcessLongTerm) {
                    ProcessLongTerm processLongTerm = (ProcessLongTerm) process;

                    System.out.println("Requisitos: " + processLongTerm.getRequirements());
                }

                Display.lineContent("",Optional.of("-"), Optional.empty());
            }
        }
    //
}
