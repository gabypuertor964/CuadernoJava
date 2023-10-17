package poo.concessionaire;

public class Vehicle {
    
    /* Definicion de Atributos */
        private String matricula;
        private String modelo;
        private int potenciaCV;
    //

    /* Metodo constructor */
    public Vehicle(String matricula,String modelo,int potenciaCV){
        this.matricula=matricula;
        this.modelo=modelo;
        this.potenciaCV=potenciaCV;
    }

    /* Metodos de acceso a propiedades */
        public String getMatricula() {
            return matricula;
        }

        public String getModelo() {
            return modelo;
        }

        public int getPotenciaCV() {
            return potenciaCV;
        }
    //


}
