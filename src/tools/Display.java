package tools;

import java.util.Optional;

public class Display extends Styles{


    /**
     * Imprime un texto en la pmatalla, autocompletando con un caracter o con espacios y permitiendo saltos de linea.
     * 
     * @param content Contenido de la linea a imprimir
     * @param symbol Simbolo usado para centrar el texto
     * @param salt Tipo de salto de linea
     */
    public static void lineContent(String content,Optional <String> symbol,Optional <String> salt){

        //Si el caracter no esta presente, asignar un espacio
        if(!symbol.isPresent()){
            symbol = Optional.of(" ");
        };
        
        //En caso de no indicar el tipo de salto de linea, este no sera ejecutado
        if(!salt.isPresent()){
            salt = Optional.of("none");
        };

        System.out.println(printText(content,symbol,salt));
    }

    /**
     * Imprime el título principal y un subtítulo personalizado.
     * 
     * @param subtitle Subtítulo personalizado.
     */
    public static void header(String subtitle){
        
        System.out.println(printText("Bienvenido al sistema de aprendizaje",Optional.of("="),Optional.empty()));

        lineContent(subtitle, Optional.of("="), Optional.of("down"));
    }

    /**
     * Imprime un pie de página.
     */
    public static void footer(){
        System.out.println(printText("",Optional.of("="),Optional.empty()));
    }
}
