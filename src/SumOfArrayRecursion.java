public class SumOfArrayRecursion {

   static int[] arr = {10,2,3,50,4};

    public static void main(String[] args) {
        //System.out.println(arr.length);

        int sumOfArrayVariable = sumOfArray(arr.length-1);
        System.out.println("Sum of array is " + sumOfArrayVariable);
    }
    public static int sumOfArray(int indexOfArray){

        if(indexOfArray==0)
        {
            return arr[indexOfArray];
        }
        return arr[indexOfArray] + sumOfArray(indexOfArray-1);
    }
}
