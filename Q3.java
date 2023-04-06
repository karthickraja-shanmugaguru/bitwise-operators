// Q 3.) clear the ith bit of a number.
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number");
        int num1=sc.nextInt();
        System.out.println("Enter your \"i\" th element number");
        int i=sc.nextInt();
        int temp =1<<(i-1);
        int num2= num1 & ~temp;
        System.out.println(num2);
    }
}
