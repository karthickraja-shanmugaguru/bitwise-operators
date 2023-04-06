// Q 1. )Check if the ith bit is set or not
import java.util.Scanner;
public class Q1 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    System.out.println("Enter the \"i\"th element");
    int i=sc.nextInt();
    int temp = num &1<<(i-1);
    if(temp != 0 ){
        System.out.println("set");
    }
    else{
        System.out.println("not set");
    }
 }
    
}