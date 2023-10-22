package abstract_class.geometry;

public class Square extends Figures{

    /* Atributos */
        private int longSide;
    //
    
    /* Metodo Constructor */
        public Square(int longSide){

            //Llamar al constructor de la clase abstracta Figures
            super(4);

            //Inicializar la logitud de cada lado
            this.longSide = longSide;
        }
    //

    /* Metodos Generales */

        //Sobreescribir el metodo area de la clase abstracta Figures
        @Override
        public String area(){
            return "El area del cuadrado es: " + (Math.pow(longSide, 2));
        }

        //Obtener el numero de lados
        @Override
        public String sides(){
            return "El cuadrado tiene " + this.sides + " lados";
        }
    //

}
