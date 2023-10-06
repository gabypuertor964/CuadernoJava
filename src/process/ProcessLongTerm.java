package process;

public class ProcessLongTerm extends Process{
    
    /* Definicion Atributos */
        private String requirements;
    //

    /* Metodo Constructor */
    public ProcessLongTerm(int id, String name, int priority, String requirements) {
        super(id, name, priority);
        this.requirements = requirements; 
    }

    /* Metodos de modificacion de propiedades */
        public void setRequirements(String requirements) {
            this.requirements = requirements;
        }
    //

    /* Metodos de acceso a Propiedades */
        public String getRequirements() {
            return requirements;
        }
    //
    

}
