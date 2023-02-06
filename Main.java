import jdk.jfr.StackTrace;
@StackTrace
public class Main {
    public static void main(String[] args) {
    }

    public static int[] printArray(int[] result) {
        for(int i = 0; i < result.length; ++i) {
            System.out.println(result[i]);
        }

        return result;
    }

    public static char[] paintArray(char[] experimental) {
        for(int i = 0; i < experimental.length; ++i) {
            System.out.println(experimental[i]);
        }

        return experimental;
    }
}