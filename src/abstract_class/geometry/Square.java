package abstract_class.geometry;

public class Square extends Figures{
    
    /* Metodo Constructor */
        public Square(int sides){
            this.sides = sides;
        }
    //

    /* Metodos Generales */

        //Sobreescribir el metodo area de la clase abstracta Figures
        @Override
        public String area(){
            return "El area del cuadrado es: " + (this.sides * this.sides);
        }
    //

}
