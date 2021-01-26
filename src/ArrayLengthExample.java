import java.util.Arrays;

public class ArrayLengthExample {

    public int[] numberArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public void countArray() {
        int len = numberArray.length;

        try {
            for (int i = 0; i < len; i++) {
                System.out.println("Number is " + numberArray[i]);
                if (numberArray[i] == 3) {
                    numberArray = Arrays.copyOf(numberArray, numberArray.length - 2);
                    System.out.println("Changed array to: " + Arrays.toString(numberArray));
//                    continue;
                }
            }
        } catch (NullPointerException e) {
            System.err.println("Handle null exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.err.println("Handle out of bounds exception: " + e);
        } finally {
            System.out.println("Always run finally...");
        }

        System.out.println("Do next job...");
    }
}
