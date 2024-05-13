package First_Assignment_1_2;
import java.util.Scanner;
public class Vowels_or_not {
    public static void main(String[]args){
        //03-IsVowels Or Constent
        //==========================
        Scanner cin = new Scanner(System.in);
        System.out.println("Write one Character : ");
        char c = cin.next().charAt(0);
        // ouiae
        if(c == 'o' || c == 'u' || c == 'i' || c == 'a' || c == 'e' ||
                c == 'O' || c == 'U' || c == 'I' || c == 'A' || c == 'E'){
            System.out.println("The char "+ c + " Is Vowels");
        }else {
            System.out.println("The char "+ c + " Is Constent");
        }
    }
}
