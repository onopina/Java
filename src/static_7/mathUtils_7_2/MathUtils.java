package static_7.mathUtils_7_2;

public class MathUtils {

    public static int sumArray(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }                                                                             //7.2.1

    public static double averageArray(int[] arr) {
        double sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum/arr.length;
    }                                                                             //7.2.2
    public static int rangeArray(int[] arr, int a, int b) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] >= a && arr[i] <= b)
                sum++;
        }
        return sum;
    }                                                                             //7.2.3

    public static int rangeMinMaxArray(int[] arr) {
        int count = 0;
        int min = arr[0];
        int max = arr[0];
        int index_min = 0;
        int index_max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index_min = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                index_max = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i > index_min && i < index_max)
                count++;
        }
        return count;
    }                                                                             //7.2.4

    public static int doubleToInt(double num) {
        int result = 0;
        for(int i=-1000000; i<1000000; i++) {

            if (num > 0 && num > i && num < (i+1))
                result = i;

            if (num < 0 && num > i && num < (i+1))
                result = i+1;
        }
        return result;
    }                                                                             //7.2.5


    public static int Formula(int x) {
        int result = x*x + x + 1;
        return result;
    }                                                                             //7.2.6

}
