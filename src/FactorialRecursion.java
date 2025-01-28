import java.math.BigInteger;
import java.util.Scanner;

public class FactorialRecursion {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number to calculate factorial");
            int number = scanner.nextInt();

            if (number < 0)
            {
               //throw new Exception("Please provide positive value");
                 throw new IllegalArgumentException("Please provide positive value");
            }
            BigInteger result = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is " + result);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static BigInteger calculateFactorial(int number) {
        if(number == 1 || number == 0) {
            return BigInteger.ONE;
        }else {
            //return number * calculateFactorial(number -1);
            return BigInteger.valueOf(number).multiply(calculateFactorial(number - 1));
        }
    }
}
