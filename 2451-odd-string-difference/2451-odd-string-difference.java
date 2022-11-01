class Solution {
    
    public int[] getDiff(String word){
        int []diff=new int[word.length()-1];
        for(int i=1;i<word.length();i++){
            diff[i-1]=word.charAt(i)-word.charAt(i-1);
        }
        return diff;
    }
    public String oddString(String[] words) {
       ArrayList<int[]> list=new ArrayList<>();
       int length=words.length;
        for(int i=0;i<words.length;i++){
            int []arr=getDiff(words[i]);
            list.add(arr);
        }
        
        for(int i=0;i<words.length;i++){
            int[] curr=list.get(i);
            int count=0;
            for(int j=0;j<words.length;j++){
                if(Arrays.compare(curr,list.get(j))==0){
                    count++;
                }
            }
            if(count==1){
                return words[i];
            }
        }
       return words[0];                       
        
    }
}