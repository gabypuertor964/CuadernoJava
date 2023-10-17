package poo.process;

public class Process {
    
    /* Declaracion de atributos */
        private int id;
        private String name;
        private int priority;
    //

    /* Metodo Constructor */
        public Process(int id, String name, int priority) {
            this.id = id;
            this.name = name;
            this.priority = priority;
        }
    //

    /* Metodos de modificacion de propiedades */
        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }
    //

    /* Metodos de acceso a Propiedades */
        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getPriority() {
            return priority;
        }
    //

}
