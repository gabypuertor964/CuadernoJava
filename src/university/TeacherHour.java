package university;

public class TeacherHour extends Teacher{
    
    /* Definicion de atributos */
        public int horas;
    //

    /* Metodo constructor */
    public TeacherHour(String rut, String name, String especialidad, int horas) {
        super(rut, name, especialidad);
        this.horas = horas;
    }

    /* Metodos de actualizacion de propiedades */
        public void setHoras(int horas) {
            this.horas = horas;
        }
    //

    /* Metodos de acceso a propiedades */
        public int getHoras() {
            return horas;
        }
    //

    /* Metodos Generales */
        public void getData(){
            System.out.println("Rut: " + this.getRut());
            System.out.println("Nombre: " + this.getName());
            System.out.println("Especialidad: " + this.getEspecialidad());
            System.out.println("Horas: " + this.getHoras());
        }
    //
}
