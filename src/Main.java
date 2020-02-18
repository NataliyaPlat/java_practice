
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//You need to create a program, which will accept a string and check if total count on characters within the string is even it should return:
//
//“String is even” If not it should return: “String is not even”
           String text;
           System.out.println("Enter string:");
           Scanner input = new Scanner(System.in);
           text = input.nextLine();
           int a=text.length();
           if (a % 2 == 0)
               System.out.println("Entered number is even");
           else
               System.out.println("entered number is odd");
    }
}
