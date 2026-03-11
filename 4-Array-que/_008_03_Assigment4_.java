import java.util.Scanner;
public class _008_03_Assigment4_ {
    public static int findIndex(int []arr,int m){
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == m) {
                return i;
            }
        }
        return -1;
	}
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
		int m = sc.nextInt();
        int ans = findIndex(arr, m);
        System.out.println(ans);
    }
}
