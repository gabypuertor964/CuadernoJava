package school;

public class Profesor extends Persona {

    /* Declaracion atributos */
        private String id;
    //

    /* Metodo constructor */
    public Profesor(String names, String surnames, int age,String id){
        super(names,surnames,age);
        this.id=id;
    }

    /* Metodos de actualizacion de propiedades */
        public void setId(String id) {
            this.id = id;
        };
    //

    /* Metodos de acceso a propiedades */
        public String getId() {
            return id;
        };

        public void getData(){
            System.out.println("Nombres: " + this.getNames());
            System.out.println("Apellidos: " + this.getSurnames());
            System.out.println("Edad: " + this.getAge());
            System.out.println("Identificación: " + this.getId());
        }
    //


}
