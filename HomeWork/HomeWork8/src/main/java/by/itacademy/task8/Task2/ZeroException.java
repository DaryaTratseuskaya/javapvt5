package by.itacademy.task8.Task2;

/**
 * Created by daryatratseuskaya on 12/7/17
 */
public class ZeroException extends Exception {
    public int errorCode;


    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }


    public ZeroException(){
        super("Соообщение на русском");
    }

    public ZeroException(String message){
        super(message);
    }
    public ZeroException(String message, Throwable throwable){
        super(message, throwable);
    }
}
