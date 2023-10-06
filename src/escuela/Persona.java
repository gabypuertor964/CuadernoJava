package escuela;

public class Persona {

    public String names;
    public String surnames;
    public int age;

    //Constructor Method
    public Persona(String nombres,String apellidos,int age){
        this.names=names;
        this.surnames=surnames;
        this.age=age;
    }

    public String getNames() {
        return names;
    }

    public String getSurnames() {
        return surnames;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
