public class SumOfArrayRecursion {

   static int[] arr = {10,2,3,50,4,1};
   static int methodExecutionCount = 1;

    public static void main(String[] args) {
        //System.out.println(arr.length);

        int sumOfArrayVariable = sumOfArray(arr.length-1);
        System.out.println("Sum of array is " + sumOfArrayVariable);
    }
    private static int sumOfArray(int indexOfArray){
        System.out.println("sumOfArray method execution " + methodExecutionCount++);
        if(indexOfArray==0)
        {
            return arr[indexOfArray];
        }
        return arr[indexOfArray] + sumOfArray(indexOfArray-1);
    }
}
