package CatchingExceptionsUsingClassException;

public class ExceptionB extends ExceptionA {
    public ExceptionB(String message)
    {
        super(message);
    }

    public static void getExceptionB() throws ExceptionB
    {
        throw new ExceptionB("Exception B");
    }
}
