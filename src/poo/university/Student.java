package university;

public class Student extends Person{
    
    /* Definicion de atributos*/
        public String universidad;
    //

    /* Metodo constructor */
    public Student(String rut, String name, String universidad) {
        super(rut, name);
        this.universidad = universidad;
    }

    /* Metodos de actualizacion de propiedades */
        public void setCarrera(String universidad) {
            this.universidad = universidad;
        }
    //

    /* Metodos de acceso a propiedades */
        public String getUniversidad() {
            return universidad;
        }
    //

}
