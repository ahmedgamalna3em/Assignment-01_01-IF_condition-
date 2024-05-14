package First_Assignment_1_2;
import java.util.Scanner;
public class Sum_positive_And_Sum_Negative {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        int num;
        int sum_Positive = 0;
        int sum_negative = 0;
        for(int i=1;i<=6;i++){
            System.out.print("Enter number "+i +" : ");
            num = input.nextInt();
            if(num<0){
                sum_negative += num;
            }
            else{
                sum_Positive +=num;
            }
        }
        System.out.println("The Total For Positive Number is : "+sum_Positive);
        System.out.println("The Total For Negative Number is : "+sum_negative);
    }
}
