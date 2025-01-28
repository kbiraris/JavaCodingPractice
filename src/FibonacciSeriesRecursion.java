import java.util.Scanner;

public class FibonacciSeriesRecursion {

    public static void main(String[] args) {

        System.out.println("Enter number for Fibonacci series");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Fibonacci series of " + number + " is given below");
        for(int count= 0; count < number; count++)
        {
            System.out.print(calculateFibonacciSeries(count) + " ");
        }
    }

    private static int calculateFibonacciSeries(int number) {
        if(number == 0 || number == 1){
            return number;
        }
        else{
            return calculateFibonacciSeries(number-1) + calculateFibonacciSeries(number-2);
        }
    }
}
