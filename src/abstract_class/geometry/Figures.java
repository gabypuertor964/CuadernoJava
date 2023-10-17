package abstract_class.geometry;

public abstract class Figures {
    
    /* Declaracion de Atributos */
        private int sides;
    //

    /* Metodo Constructor */
        public Figures(int sides){
            this.sides = sides;
        }
    //

    public abstract String area();

}
