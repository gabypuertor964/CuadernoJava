package poo.university;

public class Teacher extends Person{
    
    /* Definicion de atributos */
        public String especialidad;
    //

    /* Metodo constructor */
    public Teacher(String rut, String name, String especialidad) {
        super(rut, name);
        this.especialidad = especialidad;
    }

    /* Metodos de actualizacion de propiedades */
        public void setEspecialidad(String especialidad) {
            this.especialidad = especialidad;
        }
    //

    /* Metodos de acceso a propiedades */
        public String getEspecialidad() {
            return especialidad;
        }
    //

}
