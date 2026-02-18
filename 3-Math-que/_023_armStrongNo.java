
import java.util.Scanner;

public class _023_armStrongNo {
    public static int digit(int n){
        int digits=0;
        while (n!=0){
            int temp=n%10;
            digits++;
            n/=10;
        }return digits;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int sum=0;
        int digit=digit(n);
        while (n!=0){
            int temp=n%10;
            sum=sum+(int)Math.pow(temp,digit);
            n/=10;
        }
        if(sum==num){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
