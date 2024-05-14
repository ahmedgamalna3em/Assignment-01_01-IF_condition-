package First_Assignment_1_2;
import java.util.Scanner;
public class GreatestNumber {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Enter First Number : ");
        num1 = input.nextInt();
        System.out.print("Enter Second Number : ");
        num2 = input.nextInt();
        System.out.print("Enter Third Number : ");
        num3 = input.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("The greatest Number is : "+num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("The greatest Number is : "+num2);
        }else{
            System.out.println("The greatest Number is : "+num3);
        }
    }
}
