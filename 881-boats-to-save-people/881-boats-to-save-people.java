class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int ans=0;
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        while(i<j){
            int value=people[i]+people[j];
            if(value<=limit){
                ans++;
                i++;
                j--;
            }
            else{
                ans++;
                j--;
            }
        }
        
        if(i==j){
            ans+=1;
        }
        return ans;
    }
}