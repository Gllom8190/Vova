import org.junit.Test;

public class INT {
    private int[] first = {1, 2, 3, 4, -1, 6, -6, 8, 9, 10, 11, 2, 5, 6, 7, 1, 3, 4};
    private int[] second = {7, 8, 9, 10, 11};
    private int to = 5;
    private int from = 10;



        @Test
        public void checkSort() {
            int[] result = {-6, -1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 8, 9, 10, 11};
            TestFunction.booleanTrue(TestFunction.
                    isArraysEqual(
                            FunctionINT.bubbleSort(first),
                            result
                    ));

        }

        @Test
        public void checkMin() {
            int result = -6;
            TestFunction.booleanTrue(TestFunction.
                    isArraysOneDigit(
                            FunctionINT.minNumber(first),
                            result
                    ));
        }
        @Test
        public void checkMax () {
            int result = 11;
            TestFunction.booleanTrue(TestFunction.
                    isArraysOneDigit(
                           FunctionINT.maxNumber(first),
                            result
                    ));
        }
        @Test
        public void maxAndMinElement() {
            int [] result = {11,-6};
            TestFunction.booleanTrue(TestFunction.
                    isArraysEqual(
                            FunctionINT.maxAndMinElement(first),
                            result
                    ));
        }
        @Test
        public void checkMinUnevenElement() {
            int result = -1;
            TestFunction.booleanTrue(TestFunction.
                    isArraysOneDigit(
                            FunctionINT.minUnevenElement(first),
                            result
                    ));
        }
        @Test
        public void checkMaxEvenElement() {
            int result = 10;
            TestFunction.booleanTrue(TestFunction.
                    isArraysOneDigit(
                            FunctionINT.maxEvenElement(first),
                            result
                    ));
        }
        @Test
        public void checkPushElement() {
            int [] result = {5,1, 2, 3, 4, -1, 6, -6, 8, 9, 10, 11, 2, 5, 6, 7, 1, 3, 4};
            TestFunction.booleanTrue(TestFunction.
                    isArraysEqual(
                            FunctionINT.pushElement(first,to),
                            result
                    ));
        }
        @Test
        public void checkAddElement() {
            int [] result = {1, 2, 3, 4, -1, 6, -6, 8, 9, 10, 11, 2, 5, 6, 7, 1, 3, 4,5};
            TestFunction.booleanTrue(TestFunction.
                    isArraysEqual(
                            FunctionINT.addElement(first,to),
                            result
                    ));
        }
        @Test
        public void checAddElement() {
            int [] result = {1, 2, 3, 4, -1, 6, -6, 8, 9, 10, 11, 2, 5, 6, 7, 1, 3, 4,5};
            TestFunction.booleanTrue(TestFunction.
                    isArraysEqual(
                            FunctionINT.addElement(first,to),
                            result
                    ));
        }
        @Test
        public void checkRemoveElement() {
            int [] result = {1, 2, 3, 4, -1, -6, 8, 9, 10, 11, 2, 5, 6, 7, 1, 3, 4};
            TestFunction.booleanTrue(TestFunction.
                    isArraysEqual(
                            FunctionINT.removeElement(first,to),
                            result
                    ));
        }
        @Test
        public void checkRemoveAllEven() {
            int[] result = {1, 3,-1, 9, 11, 5, 7, 1, 3 };
            TestFunction.booleanTrue(TestFunction.
                    isArraysEqual(
                            FunctionINT.removeAllEven(first),
                            result
                    ));
        }
        @Test
        public void checkReverseArray() {
            int [] result = {4,3,1,7,6,5,2,11,10,9,8,-6,6,-1,4,3,2,1};
            TestFunction.booleanTrue(TestFunction.
                    isArraysEqual(
                            FunctionINT.reverseArray(first),
                            result
                    ));
        }
        @Test
        public void checkHasNegative() {
            boolean result = true;
           TestFunction.booleanTrue(
                            FunctionINT.
                                    hasNegative(
                                            first),
                   result
                    );
        }
        @Test
        public void checkDeleteElementByValue() {
            int [] result = {1, 2, 3, 4, -1, 6, -6, 8, 9, 10, 11, 2, 6, 7, 1, 3, 4};
            TestFunction.booleanTrue(TestFunction.
                    isArraysEqual(
                            FunctionINT.deleteElementByValue(first,to),
                            result
                    ));
        }
        @Test
        public void checkIsRepeat() {
            boolean result = true;
            TestFunction.booleanTrue(
                            FunctionINT.isRepeat(first),
                            result
                    );
        }
        @Test
        public void checkDeleteFromTo() {
            int [] result = {1, 2, 3, 4, -1, -6, 8, 9, 10, 2 , 5, 6, 7, 1, 3, 4};
            TestFunction.booleanTrue(TestFunction.
                    isArraysEqual(
                            FunctionINT.deleteFromTo(first,from,to),
                            result
                    ));
        }
        @Test
        public void checkFunction() {
            int[] temp = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int[] result = {0, 1, 2, 9, 10};
            int from = 3;
            int to = 8;
             TestFunction.booleanTrue(TestFunction.
                    isArraysEqual(
                            FunctionINT.function(temp, from, to),
                            result
                    ));
        }
        @Test
        public void checkCoin() {
            int result = 9;
            TestFunction.booleanTrue(TestFunction.
                    isArraysOneDigit(
                            FunctionINT.count(first),
                            result
                    ));
        }
        @Test
        public void checkJoin() {
            int [] result = {1, 2, 3, 4, -1, 6, -6, 8, 9, 10, 11, 2, 5, 6, 7, 1, 3, 4, 7, 8, 9, 10, 11};
            TestFunction.booleanTrue(TestFunction.
                    isArraysEqual(
                            FunctionINT.join(first,second),
                            result
                    ));
        }
        @Test
        public void checkSumArray() {
            int result = 75;
            TestFunction.booleanTrue(TestFunction.
                    isArraysOneDigit(
                            FunctionINT.sumArray(first),result
                    ));
        }
        @Test
        public void checkIsNumberPrime() {
            boolean result = true;
            TestFunction.booleanTrue(FunctionINT.isNumberSimple(to),
                            result);
        }
    }

