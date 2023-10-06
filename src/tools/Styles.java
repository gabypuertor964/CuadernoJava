package tools;

//Importacion Paqueteria requerida
import java.util.Optional;

public class Styles {

    /* Declaracion de atributos */

        //Longitud maxima de la cadena
        public static int max = 50;
    //

    /**
     * Imprime un texto centrado en la pantalla, autocompletando con un caracter o con espacios.
     * 
     * @param text Texto a imprimir.
     * @param symbol Caracter a utilizar para autocompletar.
     * @param salt Tipo de salto de linea.
     */
    public static String printText(String text, Optional <String> symbol,Optional <String> salt){

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

        //Ingresa un salto de linea si es necesario
        if (salt.isPresent() && ("up".equals(salt.get()) || "double".equals(salt.get()))) {
            cadena.append("\n");
        }

        //Ingresa los caracteres a la cadena
        for (int i = 0; i < left; i++) {
            cadena.append(symbol.get());
        }

        //Ingresa el texto original
        cadena.append(" ");
        cadena.append(text);
        cadena.append(" ");

        //Ingresa los caracteres a la cadena
        for (int i = 0; i < right; i++) {
            cadena.append(symbol.get());
        }

        //Ingresa un salto de linea si es necesario
        if (salt.isPresent() && ("down".equals(salt.get()) || "double".equals(salt.get()))) {
            cadena.append("\n");
        }

        //Retornar el texto
        return cadena.toString();
    }
}
