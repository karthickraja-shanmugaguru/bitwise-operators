// Check if a number is a power of 4?
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your number here :");
        int num = sc.nextInt();
        int temp1 = num & num-1;
         int temp2 = num & 0xAAAAAAAA;
         if(temp1==0 && temp2==0){
            System.out.println(num +" is a power of 4");
         }
         else{
            System.out.println(num +" is a not power of 4");
         }
    }
}
