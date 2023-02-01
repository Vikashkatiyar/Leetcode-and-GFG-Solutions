class Solution {
    public int takeCharacters(String s, int k) {
        int[]arr=new int[3];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }

        arr[0]-=k;
        arr[1]-=k;
        arr[2]-=k;

        if(arr[0]<0||arr[1]<0||arr[2]<0)
          return -1;

        int i=0;
        int ans=0;


        for(int j=0;j<s.length();j++){ //sliding window loop
            char ch=s.charAt(j);
            arr[ch-'a']--;

            if(arr[0]<0||arr[1]<0||arr[2]<0){ 
                while(arr[0]<0||arr[1]<0||arr[2]<0){ //include exclude window
                    arr[s.charAt(i)-'a']++;
                    i++;
                }
            }

            ans=Math.max(ans,j-i+1);
        }
        return s.length()-ans;
    }
}
