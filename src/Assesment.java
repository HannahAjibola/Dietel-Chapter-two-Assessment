import java.util.Scanner;
public class Assesment{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println("Enter a number between 0 and 1000:");
        int number = input.nextInt();
        int fourthDigit = number % 10;
        number = number / 10;
        int thirdDigit = number % 10;
        number = number / 10;
        int secondDigit = number % 10;
        number = number / 10;
        int firstDigit = number % 10;
        number = number / 10;

        int sum = firstDigit + secondDigit + thirdDigit + fourthDigit;
        System.out.println("the sum of all the number is:" + sum);
    }
    }

