package animal;

//Declaracion superclase
public class Animal {

    /* Declaracion de Atributos */
    private String nombre;
    private String origen;
    private int patas;

    //Constructor
    public Animal(String nombre,String origen,int patas){
        this.nombre=nombre;
        this.origen=origen;
        this.patas=patas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
