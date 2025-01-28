public class SumOfArrayRecursion {

   static int[] arr = {10,2,3,50,4,1};

    public static void main(String[] args) {
        //sum of the array using recursion
        int sumOfArrayVariable = sumOfArray(arr.length-1);
        System.out.println("Using recursion Sum of array is " + sumOfArrayVariable);

        //sum of the array using for loop
        int sum=0;
        for(int i=0; i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("Using for loop sum of array is " + sum);
    }

    private static int sumOfArray(int indexOfArray){
        if(indexOfArray==0)
        {
            return arr[indexOfArray];
        }
        return arr[indexOfArray] + sumOfArray(indexOfArray-1);
    }
}
