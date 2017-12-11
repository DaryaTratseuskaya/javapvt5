package by.itacademy.task9.Task2;

/**
 * Created by daryatratseuskaya on 12/7/17
 */
public class InputException extends Exception{
    public String errorText;

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }
}
