package CatchingExceptionsUsingClassException;

import java.io.IOException;

public class UsingExceptions {
    public static void main(String[] args) {
        try {
            getExceptionA();
        } catch (Exception exception) {
            System.err.println("throw new ExceptionA and caught with catch block specifying type Exception");
            exception.printStackTrace();
            System.out.println();
        }

        try {
            getExceptionB();
        } catch (Exception exception) {
            System.err.println("throw new ExceptionB and caught with catch block specifying type Exception");
            exception.printStackTrace();
            System.out.println();
        }
        
        try {
            throw new NullPointerException();
        } catch (Exception exception) {
            System.out.println();
            System.err.println("throw new NullPointerException and caught with catch block specifying type Exception");
            exception.printStackTrace();
        }

        try {
            throw new IOException();
        } catch (Exception exception) {
            System.out.println();
            System.err.println("throw new IOException and caught with catch block specifying type Exception");
            exception.printStackTrace();
        }


    }

    public static void getExceptionA() throws ExceptionA {
        throw new ExceptionA("Exception A");
    }

    public static void getExceptionB() throws ExceptionB {
        throw new ExceptionB("Exception B");
    }


}
