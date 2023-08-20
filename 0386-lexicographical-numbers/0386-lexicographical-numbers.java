class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=9;i++){
            dfs(i,n,ans); //print iTh full Family and so on...
        }
        return ans;
    }
    
    public void dfs(int i ,int n ,List<Integer> ans){
        if(i>n){
            return;
        }
        ans.add(i);
        for(int j=0;j<10;j++){
            dfs(10*i+j,n,ans);
        }
    }
}