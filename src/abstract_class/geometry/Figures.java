package abstract_class.geometry;

public abstract class Figures {
    
    /* Declaracion de Atributos */
        public int sides;
    //

    /* Metodo Constructor */
        public Figures(int sides){
            this.sides = sides;
        }
    //

    public abstract String area();
    public abstract String sides();

}
