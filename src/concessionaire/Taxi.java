package concessionaire;

public class Taxi extends Vehicle{
    
    /* Definicion de Atributos */
        private String numeroLicencia;
    //

    /* Metodo constructor */
    public Taxi(String matricula,String modelo,int potenciaCV,String numeroLicencia){
        super(matricula,modelo,potenciaCV);
        this.numeroLicencia=numeroLicencia;
    }

    /* Metodos de actualizacion de propiedades */
        public void setNumeroLicencia(String numeroLicencia) {
            this.numeroLicencia = numeroLicencia;
        }
    //

    /* Metodos de acceso a propiedades */
        public String getNumeroLicencia() {
            return numeroLicencia;
        }
    //

    /* Metodos Generales */
        public void getData(){
            System.out.println("Matricula: " + getMatricula());
            System.out.println("Modelo: " + getModelo());
            System.out.println("Potencia CV: " + getPotenciaCV());
            System.out.println("Numero de Licencia: " + getNumeroLicencia());
        }
    //

}
