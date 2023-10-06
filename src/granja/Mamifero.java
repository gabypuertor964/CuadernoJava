package granja;

public class Mamifero {

    /* Declaracion de atributos */
    private String nombre;
    private String origen;
    private int patas;

    /* Metodo constructor */
    public Mamifero(String nombre,String origen,int patas){
        this.nombre=nombre;
        this.origen=origen;
        this.patas=patas;
    }

    /* Metodos de acceso a propiedades */
    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public int getPatas() {
        return patas;
    }

}
