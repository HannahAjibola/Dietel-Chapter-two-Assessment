package chapterTwoAssesment;
import java.util.Scanner;
public class Physics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed in second or meters: ");
        double Speed = input.nextDouble();
        System.out.println("Enter airplane acceleration:");
        double acceleration = input.nextDouble();
        double  length = Speed * Speed;

        double a = 2 * acceleration ;

        double root = length / a;
        System.out.println("the minium run away lenght for this airplane is:" + root);
    }
}
