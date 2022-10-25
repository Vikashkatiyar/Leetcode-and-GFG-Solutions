class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        Deque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<k;i++){
            while(q.size()>0 && q.peekLast()<arr[i]){
                q.removeLast();
            }
           q.add(arr[i]);
        }
        list.add(q.peek());
        int idx=0;
        for(int i=k;i<arr.length;i++){
            if(q.peek()==arr[idx]){
                q.pop();
            }
            idx++;
             while(q.size()>0 && q.peekLast()<arr[i]){
                q.removeLast();
            }
           q.add(arr[i]);
           list.add(q.peek());
        }
        
        int []res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}