package First_Assignment_1_2;
import java.util.Scanner;
public class MinAndMax {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Enter No.1 : ");
        num1 = input.nextInt();
        System.out.print("Enter No.2 : ");
        num2 = input.nextInt();
        System.out.print("Enter No.3 : ");
        num3 = input.nextInt();
        if(num1==num2 && num2==num3){
            System.out.println("The Three number is Equales.");

        }
        else if (num1<num2 && num1<num3){
            System.out.println("Min="+num1);
            if(num2<num3){
                //System.out.println(num2);
                System.out.println("MAX="+num3);
            }
            else if (num3<num2){
                //System.out.println(num3);
                System.out.println("MAX="+num2);
            }
        }
        else if (num2<num1 && num2<num3){
            System.out.println("Min="+num2);
            if(num1<num3){
                //System.out.println(num1);
                System.out.println("MAX="+num3);
            }
            else if (num3<num1){
                //System.out.println(num3);
                System.out.println("MAX="+num1);

            }
        }
        else if (num3<num1 && num3<num2){
            System.out.println("Min="+num3);
            if(num1<num2){
                //System.out.println(num1);
                System.out.println("MAX="+num2);
            }
            else if(num2<num1){
                //System.out.println(num2);
                System.out.println("MAX="+num1);

            }
        }
    }

}
