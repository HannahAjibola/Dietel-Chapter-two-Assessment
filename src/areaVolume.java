import java.util.Scanner;
public class areaVolume {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.println("Enter the length of the cylinder:");
        float length = input.nextFloat();
        System.out.println("Enter the radius of the cylinder:");
        float radius = input.nextFloat();
        double pi = 3.14159;

        double area = pi * radius * radius;
        double volume = area * length;
        System.out.println("The area is:" + area);
        System.out.println("The volume is:" + volume);
    }
}
