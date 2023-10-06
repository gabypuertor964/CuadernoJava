package escuela;

public class Persona {

    /* Declaracion atributos */
        public String names;
        public String surnames;
        public int age;
    //

    //Metodo constructor
    public Persona(String names,String surnames,int age){
        this.names=names;
        this.surnames=surnames;
        this.age=age;
    }

    /* Metodos de acceso a propiedades */
        public String getNames() {
            return names;
        }

        public String getSurnames() {
            return surnames;
        }

        public int getAge() {
            return age;
        }
    //
}
