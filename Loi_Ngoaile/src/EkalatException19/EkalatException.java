package EkalatException19;

public class EkalatException extends Exception{}
public class ZeroDenominatorExcrption extends RuntimeException{
    public ZeroDenominatorExcrption(){
        this("Demominantor is Zero.");
    }
    public ZeroDenominatorExcrption(String name){
        super(name + "Division by zero !!!!! ");
    }
}
