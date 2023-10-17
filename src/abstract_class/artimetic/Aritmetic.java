package abstract_class.artimetic;

public class Aritmetic extends Operations {

    //Metodo constructor
    public Aritmetic(int num_1, int num_2){
        this.num_1 = num_1;
        this.num_2 = num_2;
    }

    /* Metodos Generales */

        public String showSum(){
            return ("La suma es: " + sum());
        }

        public String showRest(){
            return ("La resta es: " + rest());
        }

    //

}
