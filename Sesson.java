package First_Assignment_1_2;
import java.util.Scanner;
public class Sesson {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        //02-print name for Sesson
        //==========================
        System.out.print("Give me the number of month : ");
        int numMonth = input.nextInt();
        if(numMonth ==3 ||numMonth ==4 ||numMonth ==5 ){
            //3-4-5 Spring
            System.out.println("The month No. " +numMonth+ " in Spring .");
        } else if (numMonth ==6 ||numMonth ==7 ||numMonth ==8) {
            System.out.println("The month No. " +numMonth+ " in Summer .");
        } else if(numMonth ==9 ||numMonth ==10 ||numMonth ==11){
            System.out.println("The month No. " +numMonth+ " in Atumumn .");
        } else {
            System.out.println("The month No. " +numMonth+ " in Winter .");
        }

    }
}
