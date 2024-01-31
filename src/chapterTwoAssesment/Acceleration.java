package chapterTwoAssesment;
import java.util.Scanner;
public class Acceleration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter velocity in second or meters:");
        float v1 = input.nextFloat();
        System.out.println("Enter velocity in meters:");
        float v0 = input.nextFloat();
        System.out.println("Enter time span in seconds:");
        float t = input.nextFloat();
        float a = (v1 - v0 )/ t;
        System.out.println("The average acceleration is:" + a);
    }
}
