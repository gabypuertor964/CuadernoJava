package functions;

//Importacion Paqueteria requerida
import java.util.Optional;

public class styles {
    //Longitud maxima de la linea
    public static int max = 50;

    //Metodo encargado de imprimir con la longitud maxima
    public static String printLitle(String text, Optional <Boolean> salt){

        //Calcular la diferencia entre la longitud maxima y la longitud del texto
        int diferencia = max - text.length();

        //Si la diferencia es menor o igual a 0 (Es decir si el texto es mayor o igual a la longitud maxima)
        if (diferencia <= 0) {
            return text;
        }

        //Calcular la cantidad de caracteres a generar a la izquierda y a la derecha
        int left = (diferencia - 1) / 2;
        int right = diferencia - left - 1;

        //Instanciar un objeto de tipo StringBuilder (Manejo de Strings)
        StringBuilder cadena = new StringBuilder();

        //Ingresa los caracteres a la cadena
        for (int i = 0; i < left; i++) {
            cadena.append("=");
        }

        //Ingresa el texto original
        cadena.append(" ");
        cadena.append(text);
        cadena.append(" ");

        //Ingresa los caracteres a la cadena
        for (int i = 0; i < right; i++) {
            cadena.append("=");
        }

        //Ingresa un salto de linea si es necesario
        if(salt.isPresent() && salt.get() == true){
            cadena.append("\n");
        };

        //Retornar el texto
        return cadena.toString();
    }
}
