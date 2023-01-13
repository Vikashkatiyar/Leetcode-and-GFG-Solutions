class Solution {
    static int max=1;
    public static int dfs(int node,ArrayList<Integer> [] graph,String s){
        int sum=1;
        int tempMax1=0,tempMax2=0;
        
        for(int val : graph[node]){
            int temp=0;
            temp = dfs(val,graph,s);
        
            if(s.charAt(node)!=s.charAt(val)){        
                if(temp>tempMax1){
                    tempMax2=tempMax1;
                    tempMax1=temp;
                }else if(tempMax2<temp){
                    tempMax2 = temp;
                }
            }
        }

        sum+=tempMax1+tempMax2;
        max=Math.max(max,sum);
        return tempMax1+1;
    }
    

    public int longestPath(int[] parent, String s) {

        ArrayList<Integer> [] arr = new ArrayList[parent.length];

        System.out.println(parent.length);

        for(int i=0;i<arr.length;i++){
            arr[i] = new ArrayList<Integer>();
        }   

        for(int i=1;i<parent.length;i++){
            arr[parent[i]].add(i);
        }

        max=1;
        dfs(0,arr,s);
        return max;
    }
}
