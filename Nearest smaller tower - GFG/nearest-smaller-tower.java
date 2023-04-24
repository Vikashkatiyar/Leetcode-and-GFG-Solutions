//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int [] arr = new int[n];
			String [] str = br.readLine().trim().split(" ");
			for(int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(str[i]);
			Solution ob = new Solution();
			int [] ans = ob.nearestSmallestTower(arr);
			for(int i = 0; i < n; i++)
				System.out.print(ans[i]+" ");
			System.out.println();
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution{
	int [] nearestSmallestTower(int [] arr){
		int n=arr.length;
		int []ans=new int[n];
		int [] right=rightSmallest(arr,n);
		int [] left=leftSmallest(arr,n);
		
		for(int i=0;i<n;i++){
		  //  case 1: -1 numbers
		  if(left[i]==-1 && right[i]==-1){
		      ans[i]=-1;
		  }else if(left[i]==-1){
		      ans[i]=right[i];
		  }else if(right[i]==-1){
		      ans[i]=left[i];
		  }else{
		      //case 2:Distance
		      int x=Math.abs(i-right[i]);
		      int y=Math.abs(i-left[i]);
		      
		      if(x<y){
		          ans[i]=right[i];
		      }else if(x>y){
		          ans[i]=left[i];
		      }else{
		          
		          //case 3:Elements
		          
		          if(arr[left[i]]<arr[right[i]]){
		              ans[i]=left[i];
		          }else if(arr[left[i]]>arr[right[i]]){
		              ans[i]=right[i];
		          }else{
		              ans[i]=left[i];
		          }
		      }
		  }
		 
		}
		
	    return ans;	
	}
	
	//nextSmallest from Right
	int[] rightSmallest(int []arr,int n){
	    Stack<Integer> st=new Stack<Integer>();
	    int []right=new int[n];
	    for(int i=n-1;i>=0;i--){
	        while(st.size()>0 && arr[st.peek()]>=arr[i]){
	            st.pop();
	        }
	        right[i]=st.size()==0?-1:st.peek();
	        st.push(i);
	    }
	    return right;
	}
	
	//nextSmallest from left
	int[] leftSmallest(int[] arr,int n){
	    Stack<Integer> st=new Stack<Integer>();
	    int []left=new int[n];
	    for(int i=0;i<n;i++){
	        while(st.size()>0 && arr[st.peek()]>=arr[i]){
	            st.pop();
	        }
	        left[i]=st.size()==0?-1:st.peek();
	        st.push(i);
	    }
	    return left;
	}
}