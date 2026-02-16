import java.sql.Array;

public class Test {

    public static void main(String[] args) {

        //int[] array1 = new int[5];
        int[] array2 = {5,10,15,20,25};
        //array2[1]=10;
        //System.out.println(array2[0]);
        int sum = 0;
        for(int num : array2){
            sum += num;
        }
        System.out.println("sum is " + sum);
    }

}
