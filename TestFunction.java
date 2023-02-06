public class TestFunction {
    public static boolean isArraysEqual(int[] first, int[] second) {
        for (int i = 0; i < second.length; i++) {
            if (second[i] != first[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isArraysOneDigit(int first, int result) {
        for (int i = 0; i < 2; i++) {
            if (first != result) {
                return false;
            }
        }
        return true;
    }

    public static boolean booleanTrue(boolean first, boolean second) {
        for (int i = 0; i < 1; i++) {
            if (second == first) {
                return true;
            }
        }
        return false;
    }
    public static boolean booleanTrue(boolean first) {
        for (int i = 0; i < 1; i++) {
            if ( true == first) {
                return true;
            }
        }
        return false;
    }

    public static boolean controlInput(String str) {
        for (int i = 0; i == 10; i++) {
            ;
            if ((str.charAt(i)) <= 47 || (str.charAt(i)) >= 58) {
                return false;
            }
        }
        return true;
    }

    public static boolean controlNumberElements(String str) {
        for (int i = 0; i <= str.length(); i++) {
            if (i == 11) {
                return false;
            }
        }
        return true;
    }

    public static boolean isBooleanCheck(String str) {
        return controlInput(str) && controlNumberElements(str);
    }

    }




