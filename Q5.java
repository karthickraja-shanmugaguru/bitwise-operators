// Q 5. ) Find whether a number is even or odd
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number");
        int num1=sc.nextInt();
        int temp =num1 & 1;
        if(temp !=0){
            System.out.println("odd");
        }
        else{
            System.out.println("Even");
            
        }
    }
}
