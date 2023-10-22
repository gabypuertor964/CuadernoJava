package exceptions.try_manage;

public class Manager {

    public String division(int number1, int number2){
        try{
            return "La division es: " + number1/number2;
        }catch(ArithmeticException e){
            return "La division entre 0 no esta definida";
        }
    }

}
