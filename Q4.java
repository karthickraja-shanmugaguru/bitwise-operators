//Q 4.) Remove the last set bit of a number.
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = sc.nextInt();
        System.out.println();
        System.out.println(num & num-1);
    }
}
