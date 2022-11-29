//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
        }
        int i=0,j=0,k=0;
        while(i<pos.size() && j<neg.size()){
            arr[k]=pos.get(i);
            i++;
            k++;
            arr[k]=neg.get(j);
            j++;
            k++;
        }
        
        
        while(i<pos.size()){
            arr[k]=pos.get(i);
            i++;
            k++;
        }
        
        while(j<neg.size()){
            arr[k]=neg.get(j);
            j++;
            k++;
        }
    }
}