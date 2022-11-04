//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
        int[] mix = new int[r-l+1];
        
        int i = l;
        int j = m+1;
        int k = 0;
        
        while(i <= m && j <= r) {
            if(arr[i] <= arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            
            k++;
        }
        
        while(i <= m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        
        while(j <= r) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        
        for(i=0;i<mix.length;i++) {
            arr[l+i] = mix[i];
        }
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(r>l){
            int mid=l+(r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            
            merge(arr,l,mid,r);
        }
    }
}
