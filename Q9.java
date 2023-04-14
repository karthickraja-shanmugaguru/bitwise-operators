//Q 9.) Check if a number is a power of 16?
import java.util.Scanner;
class Q9{
    public static  void main(String[] arg){
        System.out.println("Enter your number here: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp1 = num & num-1;
        int temp2 = num & 0xEEEEEEEE;
        if(temp1 ==0 && temp2 ==0){
            System.out.println(num + " is a power of 16");
        }
        else{
            System.out.println(num + " is not a power of 16");
        }
    }
}