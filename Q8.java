//Q 8.) Check if a number is a power of 8?
import java.util.Scanner;
class Q8{
    public static void main(String[] arg){
        System.out.println("Enter your number here :");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int temp1 = num & 0xB6DB6DB6;
        int temp2 = num & num-1;
        if(temp1 ==0 && temp2==0){
            System.out.println(num +" is a power of 8");
        }
        else{
            System.out.println(num +" is not a power of 8");
        }
    }
}