package farm;

public class Perro extends Mamifero {

    /* Declaracion de atributos */
    private String raza;

    /* Metodo constructor */
    public Perro(String nombre,String origen,int patas,String raza){
        super(nombre,origen,patas);
        this.raza=raza;
    }

    /* Metodos de acceso a propiedades */
    public String getRaza() {
        return raza;
    }

}
