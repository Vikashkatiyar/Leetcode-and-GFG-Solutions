// { Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int k)
           {
                 int res=1;
                 for(int n:a){
                     if(!isPalin(n)){
                         return 0;
                     }
                 }
                 return res;
           }
    private static boolean isPalin(int num){
        int temp=num;
        int tempSum=0;
        while(temp!=0){
            int last=temp%10;
            tempSum=last+tempSum*10;
            temp/=10;
        }
        return tempSum==num;
    }
}