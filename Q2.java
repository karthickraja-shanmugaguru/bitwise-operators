// Q 2.) Set the ith bit of a number.
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number");
        int num1=sc.nextInt();
        System.out.println("Enter your \"i\" th element number");
        int i=sc.nextInt();
        int num2= num1 | (1<<(i-1));
        System.out.println(num2);
    }
}
