package university;

public class StudentUndergraduate extends Student {
    
    /* Definicion Atributos */
        public String carrera;
    //

    /* Metodo Constructor */
    public StudentUndergraduate(String rut, String name, String universidad, String carrera){
        super(rut, name, universidad);
        this.carrera = carrera;
    }

    /* Metodos de actualizacion de propiedades */
        public void setCarrera(String carrera){
            this.carrera = carrera;
        }
    //

    /* Metodos de acceso a propiedades */
        public String getCarrera(){
            return carrera;
        }
    //

    /* Metodos Generales */
        public void getData(){
            System.out.println("Rut: " + this.getRut());
            System.out.println("Nombre: " + this.getName());
            System.out.println("Universidad: " + this.getUniversidad());
            System.out.println("Carrera: " + this.getCarrera());
        }
    //
}
