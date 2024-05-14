package First_Assignment_1_2;
import java.util.Scanner;
public class AreaForCircle {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        float radius;
        double pi = 3.14159;
        System.out.print("Enter The Radius For The Circle : ");
        radius = input.nextFloat();
        double area = radius*radius*pi;
        System.out.println("The Area For The Circle = "+ area);
    }
}
