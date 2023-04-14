//Q 11.) Count the number of set bits in a number
import java.util.Scanner;
class Q11{
    public  static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here :");
        int num = sc.nextInt();
        int count=0;
        while (num !=0){
            num =num&(num-1);
            count++;
        }
        System.out.println("count the number of set is "+count);
    }
}