// Check if the number is a power of 2?
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = sc.nextInt();
        int temp =  num & num-1;
        if(temp ==0 ){
            System.out.println(num +" number is a power of 2 ");
        }
        else{
            System.out.println(num +" number is not a power of 2 ");
        }
    }
}
