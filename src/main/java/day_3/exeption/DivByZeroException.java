package day_3.exeption;

public class DivByZeroException extends Exception{

    public DivByZeroException(String message) {
        super("My DivByZeroException "+ message);

    }

    public DivByZeroException() {

    }

}
