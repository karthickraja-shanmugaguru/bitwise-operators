//Q 10.) Toggle ith Bit of a number?
import java.util.Scanner;
class Q10{
    public  static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here :");
        int num = sc.nextInt();
        System.out.println("Enter your Toggle number here :");
        int i = sc.nextInt();
        int temp = num ^ (1<<i-1);
        System.out.println("The toggle number is "+ temp);
    }
}