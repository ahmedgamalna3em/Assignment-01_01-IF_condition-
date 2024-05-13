package First_Assignment_1_2;
import java.util.Scanner;
public class Calcuter {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        //04-Make Calcalute
        //==================
        int num1, num2;
        char operator;
        System.out.println("Enter First Number : ");
        num1 = input.nextInt();
        System.out.println("Enter Second Number : ");
        num2 = input.nextInt();
        System.out.println("Enter The Operator \" +,-,*,/ .\"");
        operator = input.next().charAt(0);

        switch (operator) {
            case ('+'):
                System.out.println("The result is : " + (num1 + num2));
                break;
            case ('-'):
                System.out.println("The result is : " + (num1 - num2));
                break;
            case ('*'):
                System.out.println("The result is : " + (num1 * num2));
                break;
            case ('/'):
                if (num2 == 0) {
                    System.out.println("Error.");
                } else {
                    System.out.println("The result is : " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Invalid Operator.");
                break;
        }
    }
}
