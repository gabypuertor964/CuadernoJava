package escuela;

public class Profesor extends Persona {

    private String id;

    public Profesor(String names, String surnames, int age,String id){
        super(names,surnames,age);

        this.id=id;
    }
}
