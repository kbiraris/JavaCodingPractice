package arrayaTest;

import java.util.Arrays;

public class arrayPassingToFunction {

    static void arrayCall(int[] arr2){
        Arrays.sort(arr2);
        for(int num: arr2){
            System.out.println("value is " + num);
        }
        int[] arr3 = {20,30,100};
        System.out.println(Arrays.equals(arr2,arr3));

    }
    public static void main(String[] args) {
        int[] arr1 = {100,20,30};
        arrayCall(arr1);

    }
}
