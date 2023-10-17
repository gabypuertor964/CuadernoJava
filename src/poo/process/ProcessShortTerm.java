package process;

public class ProcessShortTerm extends Process{
    
    /* Declaracion atributos */
        private int time;
    //

    /* Metodo Constructor */
    public ProcessShortTerm(int id, String name, int priority, int time) {
        super(id, name, priority);
        this.time = time;
    }

    /* Metodos de modificacion de propiedades */
        public void setTime(int time) {
            this.time = time;
        }
    //

    /* Metodos de acceso a Propiedades */
        public int getTime() {
            return time;
        }
    //

}
