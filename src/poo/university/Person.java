package poo.university;

public class Person {
    
    /* Definicion Atributos */
        protected String rut;
        protected String name;
    //

    /* Metodo constructor */
    public Person(String rut, String name) {
        this.rut = rut;
        this.name = name;
    }

    /* Metodos de actualizacion de propiedades */
        protected void setRut(String rut) {
            this.rut = rut;
        }

        protected void setName(String name) {
            this.name = name;
        }
    //

    /* Metodos de acceso a propiedades */
        protected String getRut() {
            return rut;
        }

        protected String getName() {
            return name;
        }
    //
        
}

