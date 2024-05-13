package First_Assignment_1_2;
import java.util.Scanner;
public class WaterMelon {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Write The Weight For WaterMelon : ");
        int weight = input.nextInt() ;
        if(weight%2==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
