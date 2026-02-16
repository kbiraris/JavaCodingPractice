package arrayaTest;

public class maxNumber {

    public static void main(String[] args) {

        int[] arr1 = {22,33,11,55,100};
        int max = arr1[0];
        for(int i=1; i<arr1.length;i++){
            if(arr1[i]>max){
                max = arr1[i];
            }
        }
        System.out.println("Max in array is "+ max);
    }
}
