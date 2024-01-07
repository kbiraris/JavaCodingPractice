import java.util.Arrays;

public class MoveNegativeNumbersToStart {
    public static void main(String[] args) {
        int [] intArray = {-1,2,3,-4,-7,8};
        moveNegativeNumbersToStart(intArray);
    }
    private static void moveNegativeNumbersToStart(int [] array) {
        int[] tempArray = new int[array.length];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                //System.out.print(array[i]);
                tempArray[counter] = array[i];
                counter++;
            }
        }

        for (int i = 0; i < array.length; i++)
        {
            if(array[i]>0)
            {
                tempArray[counter] = array[i];
                counter++;
            }
        }

        System.out.print(Arrays.toString(tempArray));
    }
}