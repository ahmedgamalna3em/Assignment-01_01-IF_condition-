package First_Assignment_1_2;
import java.util.Scanner;
public class Calc_Marks {
    public static void main(String[]args) {
        Scanner cin = new Scanner(System.in);
        int mark_For_Arabic, mark_For_English, mark_For_Math, mark_For_Science, mark_For_History;
        int sum_Degree = 0;
        System.out.print("Enter Mark For Arabic : " );
        mark_For_Arabic = cin.nextInt();
        System.out.print("Enter Mark For English : ");
        mark_For_English = cin.nextInt();
        System.out.print("Enter Mark For Math : ");
        mark_For_Math = cin.nextInt();
        System.out.print("Enter Mark For Science : ");
        mark_For_Science = cin.nextInt();
        System.out.print("Enter Mark For History : ");
        mark_For_History = cin.nextInt();
        sum_Degree = mark_For_Arabic+mark_For_English+mark_For_Math+mark_For_Science+mark_For_History;

        switch(sum_Degree){
            case 100:
                if(sum_Degree<=100&&sum_Degree>80){
                    System.out.println("Grade : A.");
                }
                break;
            case 80:
                if(sum_Degree<=80&&sum_Degree>60){
                    System.out.println("Grade : B.");
                }
                break;
            case 60 :
                if(sum_Degree<=60&&sum_Degree>40){
                    System.out.println("Grade : C.");
                }
                break;
            default :
                if(sum_Degree<40){
                    System.out.println("Grade : F.");
                }
                break;


        }

        }

    }


