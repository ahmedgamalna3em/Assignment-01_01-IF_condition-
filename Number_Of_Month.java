package First_Assignment_1_2;
import java.util.Scanner;
public class Number_Of_Month {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

         //01-print name for number of month
         //==================================

        System.out.print("Write the Num of Month : ");
        int numMonth = input.nextInt();
        switch(numMonth){
            case 1 :
                System.out.println("Jan");
                break;
            case 2 :
                System.out.println("Feb");
                break;
            case 3 :
                System.out.println("Mar");
                break;
            case 4 :
                System.out.println("Apr");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("Jun");
            case 7 :
                System.out.println("Jul");
                break;
            case 8:
                System.out.println("Agu");
                break;
            case 9:
                System.out.println("Sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            default :
                System.out.println("Dec");
                break;
        }
    }
}
