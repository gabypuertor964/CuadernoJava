package animal;

public class Mamifero extends Animal{

    /* Declaracion de atributos expecificos de la clase */
    private String raza;

    //Instanciamiento de la case
    public Mamifero(String nombre,String origen,int patas,String raza){

        //Instanciar a partir de la superclase, enviandole los datos requeridos
        super(nombre,origen,patas);

        //Guardado de Valores
        this.raza=raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
