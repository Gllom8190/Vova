public class FunctionINT {
    public static int minNumber(int[] first) {
        int result = first[0];
        for (int i = 1; i < first.length; i++) {
            if (first[i] < result) {
                result = first[i];
            }
        }
        return result;
    }

    public static int maxNumber(int[] first) {
        int result = first[0];
        for (int i = 1; i < first.length; i++) {
            if (first[i] > result) {
                result = first[i];
            }
        }
        return result;
    }

    public static int[] maxAndMinElement(int[] first) {
        int[] result = new int[2];
        for (int i = 0; i < first.length; i++) {
            if (first[i] > result[0]) {
                result[0] = first[i];
            } else if (first[i] < result[1]) {
                result[1] = first[i];
            }
        }
        return result;
    }

    public static int[] bubbleSort(int[] result) {
        for (int j = 0; j < result.length; j++) {
            for (int i = 0; i < result.length - 1; i++) {
                if (result[i] < result[i + 1]) {
                    int x = result[i];
                    result[i] = result[i + 1];
                    result[i + 1] = x;
                }
            }
        }
        return result;
    }

    public static int minUnevenElement(int[] first) {
        int result = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i] < result && first[i] % 2 != 0)
                result = first[i];
        }
        return result;
    }

    public static int maxEvenElement(int[] first) {
        int result = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i] > result && first[i] % 2 == 0)
                result = first[i];
        }
        return result;
    }

    public static int[] pushElement(int[] first, int r) {
        int[] result = new int[first.length + 1];
        result[0] = r;
        for (int i = 0, j = 1; i < first.length; i++, j++) {
            result[j] = first[i];
        }
        return result;
    }

    public static int[] addElement(int[] first, int r) {
        int[] result = new int[first.length + 1];
        result[first.length] = r;
        for (int i = 0; i < first.length; i++) {
            result[i] = first[i];
        }
        return result;
    }

    public static int[] removeElement(int[] first, int r) {
        int[] result = new int[first.length - 1];
        for (int i = 0, t = 0; i < first.length; i++) {
            if (r != i) {
                result[t] = first[i];
                t++;
            }
        }
        return result;
    }

    public static int count(int[] first) {
        int result = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i] % 2 != 0) {
                result++;
            }
        }
        return result;
    }

    public static int[] removeAllEven(int[] first) {
        int[] result = new int[count(first)];
        for (int i = 0, j = 0; i < first.length; i++) {
            if (first[i] % 2 != 0) {
                result[j] = first[i];
                j++;
            }
        }
        return result;
    }


    public static int[] reverseArray(int[] first) {
        int[] result = new int[first.length];
        for (int i = first.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = first[i];
        }
        return result;
    }

    public static boolean hasNegative(int[] first) {
        for (int i = 0; i < first.length; i++) {
            if (first[i] < 0) {
                return true;
            }
        }
        return false;
    }

    public static int[] deleteElementByValue(int[] first, int r) {
        int[] result = new int[first.length - 1];
        for (int i = 0, j = 0; i < first.length; i++) {
            if (first[i] != r) {
                result[j] = first[i];
                j++;
            }
        }
        return result;
    }

    public static boolean isRepeat(int[] first) {
        for (int j = first.length - 1; j >= 1; j--) {
            for (int i = j - 1; i >= 0; i--) {
                if (first[i] == first[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] deleteFromTo(int[] first, int r, int p) {
        int[] result = new int[first.length - 2];
        for (int i = 0, j = 0; i < first.length; i++) {
            if (i != r && i != p) {
                result[j] = first[i];
                j++;
            }
        }
        return result;
    }

    public static int[] function(int[] first, int from, int to) {
        int[] result = new int[first.length - (from - to + 2)];
        for (int i = 0, g = 0; i < first.length; i++, g++) {
            if (i == to - 1) {
                i = from + 1;
            }
            result[g] = first[i];
        }
        return result;
    }

    //{
    public static int[] join(int[] main, int[] joinTo) {
        int[] result = new int[main.length + joinTo.length];
        for (int i = 0, g = 0; i < result.length; i++, g++) {
            if (i == main.length) {
                g = 0;
            }
            result[i] = i < main.length ? main[g] : joinTo[g];
        }
        return result;
    }

    public static int sumArray(int[] first) {
        int result = 0;
        for (int i = 0; i < first.length; i++) {
            result += first[i];
        }
        return result;
    }
    public static boolean isNumberSimple(int experimental) {
        for(int i = 2; i < experimental; ++i) {
            if (experimental % i == 0) {
                return false;
            }
        }

        return true;
    }
}
