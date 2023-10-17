package abstract_class.artimetic;

public abstract class OperationsAbstracts {

    /* Declaracion Atibutos */
        protected int num_1;
        protected int num_2;
    //
    
    /**
     * Crear un metodo abstracto para sumar dos numeros (Puede sobreescribirse)
     * 
     * @param num_1
     * @param num_2
     * @return
     */
    public abstract int sum();

    /**
     * Crear un metodo abstracto para restar dos numeros (No Puede sobreescribirse)
    */
    public int rest(){
        return num_1-num_2;
    }

}
