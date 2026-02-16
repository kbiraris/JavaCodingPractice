package loop;

import java.util.*;

public class Loop {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Number is " + N);
        scanner.close();
        logic(N);

    }
    private static void logic(int N){
        if(N%2!=0){
            System.out.println("Weird");
        }else if(N<5 || N>20){
            System.out.println("Not Weird");
        }else{
            System.out.println("Weird");
        }
    }
}
