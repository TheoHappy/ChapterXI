public class UsingExceptions {
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception ea) {
            ea.printStackTrace();
        }

    }

    public static void someMethod() throws Exception {
        try {
            someMethod2();
        }catch (Exception ea){
            throw new Exception("This Exception caught in someMethod2, chained, and thrown as a new Exception");
        }
    }

    public static void someMethod2() throws Exception {
        throw new Exception("Exception thrown in someMethod2");
    }


}
