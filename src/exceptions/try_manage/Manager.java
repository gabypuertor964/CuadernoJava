package exceptions.try_manage;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    
    /* Declaración de Atributos */
        private List<String> options = new ArrayList<String>();
    //

    /* Metodos Generales */
        public void addText(String text){
            options.add(text);
        }

        public void showTexts(){
            for (String option : options) {
                System.out.println(option);
            }
        }
    //


}
