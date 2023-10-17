package university;

public class StudentMagister extends Student{
    
    /* Definicon atributos */
        public String tesis;
    //

    /* Metodo constructor */
    public StudentMagister(String rut, String name, String universidad, String tesis) {
        super(rut, name, universidad);
        this.tesis = tesis;
    }

    /* Metodos de actualizacion de propiedades */
        public void setTesis(String tesis) {
            this.tesis = tesis;
        }
    //

    /* Metodos de acceso a propiedades */
        public String getTesis() {
            return tesis;
        }
    //

    /* Metodos Generales */
        public void getData(){
            System.out.println("Rut: " + this.getRut());
            System.out.println("Nombre: " + this.getName());
            System.out.println("Universidad: " + this.getUniversidad());
            System.out.println("Tesis: " + this.getTesis());
        }
    //
}
