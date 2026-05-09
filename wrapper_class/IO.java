package wrapper_class;

//Wrapper class for simple IO.println();
// Available in Oracle JDK and not in openJDK
// Use this if you are using openJDK
//
final class IO {

    private static final java.io.PrintStream out = System.out;

    public static void println(Object o) {
        out.println(o);
    }

    public static void println() {
        out.println();
    }
}
