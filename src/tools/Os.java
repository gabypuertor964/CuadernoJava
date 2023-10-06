package tools;

public class Os {

    /**
     * Limpia la consola.
     */
    public static void clear(){
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
