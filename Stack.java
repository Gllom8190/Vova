public class Stack {
    public static String[] temporary;

    public static boolean isNumb(char ch) {
        return ch < 58 && ch > 47;
    }

    public static String containsNumb = "[0-9]+";

    public static boolean isNumb(String str) {
        return str.matches(containsNumb);
    }

    public static boolean isBrackets(String str) {
        return str.equals("(") || str.equals(")");
    }

    public static String[] withoutIndex;

    public static boolean isSignisBrackets(char ch) {
        return ch == 42 || ch == 43 || ch == 45 || ch == 47 || ch == 40 || ch == 41;
    }

    public static boolean isSign(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

    public static boolean isSing(char ch) {
        return ch == 42 || ch == 43 || ch == 45 || ch == 47;
    }

    public static String calculator(String str) {
        temporary = preparingString(transformationArraysString(str));
        while (temporary.length > 1) {
            String temp = shift();
            add(isSign(temp) ? performOperation(pop(), pop(), temp) : temp);
        }
        return temporary[0];
    }

    public static String[] transformationArraysString(String str) {
        String[] result = new String[spaceСount(str)];
        for (int i = 0, j = 0; i < str.length(); i++) {
            if (str.charAt(i) != 32) {
                String temp = "";
                if (isSignisBrackets(str.charAt(i))) {
                    temp += str.charAt(i);
                } else {
                    while (isNumb(str.charAt(i))) {
                        temp += str.charAt(i);
                        i++;
                    }
                }
                result[j] = temp;
                j++;
            }
        }
        return result;
    }

    public static boolean isContainsNumOrBraket(String[] toCheck) {
        for (String temp : toCheck) {
            if (temp.contains("(")) {
                return false;
            }
        }
        return true;
    }

    public static String[] preparingString(String[] strArray) {
        temporary = strArray;
        withoutIndex = new String[0];
        while (temporary.length > 0) {
            if (isContainsNumOrBraket(temporary)) {
                while (temporary.length > 0) {
                    add(withoutIndex, pop());
                }
            } else {
                String temp = shift();
                if (isSign(temp) || temp.charAt(0) == 40) {
                    add(temp);
                } else if (isNumb(temp)) {
                    add(withoutIndex, temp);
                } else {
                    temp = pop();
                    while (!temp.equals("(")) {
                        add(withoutIndex, temp);
                        temp = pop();
                    }
                }
            }
        }
        return withoutIndex;
    }

    public static String pop() {
        String[] temp = temporary;
        temporary = new String[temp.length - 1];
        for (int g = 0; g < temp.length - 1; g++) {
            temporary[g] = temp[g];
        }
        return temp[temp.length - 1];
    }

    public static void add(String str) {
        String[] temp = temporary;
        temporary = new String[temp.length + 1];
        for (int i = 0; i < temp.length; i++) {
            temporary[i] = temp[i];
        }
        temporary[temporary.length - 1] = str;
    }

    public static void add(String[] input, String str) {
        String[] result = new String[input.length + 1];
        for (int i = 0; i < input.length; i++) {
            result[i] = input[i];
        }
        result[result.length - 1] = str;
        withoutIndex = result;
    }

    public static void unshift(String str) {
        String[] temp = temporary;
        temporary = new String[temp.length + 1];
        for (int i = 1; i < temp.length; i++) {
            temporary[i] = temp[i - 1];
        }
        temporary[0] = str;
    }

    public static String shift() {
        String[] temp = temporary;
        temporary = new String[temp.length - 1];
        for (int i = 1; i < temp.length; i++) {
            temporary[i - 1] = temp[i];
        }
        return temp[0];
    }

    public static int spaceСount(String str) {
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 32)
                length++;
        }
        return length;
    }

    public static String performOperation(String firstStr, String secondStr, String sign) {
        int first = Integer.parseInt(firstStr);
        int second = Integer.parseInt(secondStr);
        switch (sign) {
            case "+" -> {
                return String.valueOf(first + second);
            }
            case "-" -> {
                return String.valueOf(first - second);
            }
            case "*" -> {
                return String.valueOf(first * second);
            }
            case "/" -> {
                return String.valueOf(first / second);
            }
            default -> {
                throw new IllegalArgumentException();
            }
        }
    }

}
