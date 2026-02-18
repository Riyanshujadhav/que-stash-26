//Given a list of numbers, stop processing input after the cumulative sum of all the input becomes negative.


// Input Format
// A list of integers to be processed


// Constraints
// All numbers input are integers between -1000 and 1000.


// Output Format
// Print all the numbers before the cumulative sum become negative.


// Sample Input
// 1
// 2
// 88
// -100
// 49
// Sample Output
// 1
// 2
// 88

import java.util.Scanner;
import java.util.Vector;

public class _037_13que {
    public static Vector<Integer> convert(int n){
        
        Vector <Integer> a =new Vector(); 
        while(n!=0){
            int k=n%10;
            a.add(k);
        }   
        return a;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        
    }
}





// while(n!=0){
        //     int temp=n%10;
        //     if(temp==3){
        //         sum=sum*10+5;
        //     }else if (temp==2) {
        //         sum=sum*10+4;
        //     }else if (temp==1) {
        //         sum=sum*10+3;
        //     }else if(temp==4){
        //         sum=sum*10+2;
        //     }else if(temp==5){
        //         sum=sum*10+1;
        //     }
        //     n/=10;
        // }