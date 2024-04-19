package exceptionbasics;

public class CustomEmployeeUncheckedException extends RuntimeException{
    public CustomEmployeeUncheckedException(String message)
    {
        super(message);
    }
}
