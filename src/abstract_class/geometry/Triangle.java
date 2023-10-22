package abstract_class.geometry;

public class Triangle extends Figures{

    /* Declaracion de atributos */
        private int base;
        private int height;
    //

    /* Metodo Constructor */
    public Triangle( int base, int height){
        //Ejecutar el constructor de la clase padre
        super(3);

        this.base = base;
        this.height = height;
    }
    

    /* Metodos Generales */
            
        //Sobreescribir el metodo area de la clase abstracta Figures
        @Override
        public String area(){
            return "El area del triangulo es: " + ((this.base * this.height) / 2);
        }

        //Obtener el numero de lados
        @Override
        public String sides(){
            return "El triangulo tiene " + this.sides + " lados";
        }
    //



}
