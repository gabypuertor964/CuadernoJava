package interfaces;

public class Workers implements CRUD {
    
    @Override
    public String create(String name){
        return "Se ha añadido a " + name + " a la lista de trabajadores";
    }

    @Override
    public String update(String name){
        return "Se ha actualizado la informacion de " + name;
    }

    @Override
    public String delete(String name){
        return "Se ha eliminado a " + name + " de la lista de trabajadores";
    }

}
