package concessionaire;

public class Bus extends Vehicle{
    
    /* Defincion de Atributos */
        private int numeroPlazas;
    //

    /* Metodo constructor */
    public Bus(String matricula,String modelo,int potenciaCV,int numeroPlazas){
        super(matricula,modelo,potenciaCV);
        this.numeroPlazas=numeroPlazas;
    }

    /* Metodos de actualizacion de las propiedades */
        public void setNumeroPlazas(int numeroPlazas) {
            this.numeroPlazas = numeroPlazas;
        }
    //

    /* Metodos de acceso a propiedades */
        public int getNumeroPlazas() {
            return numeroPlazas;
        }
    //

    /* Metodos Generales */
        public void getData(){
            System.out.println("Matricula: " + getMatricula());
            System.out.println("Modelo: " + getModelo());
            System.out.println("Potencia CV: " + getPotenciaCV());
            System.out.println("Numero de Plazas: " + getNumeroPlazas());
        }
    //

}
