package interfaces;
import java.util.HashSet;

public interface CRUD {

    /* Declaracion atributos */
        public HashSet<String> list = new HashSet<>();
    //

    /* Metodos a sobreescribir */
        public String create(String name);
        public String update(String name);
        public String delete(String name);
    //

}
