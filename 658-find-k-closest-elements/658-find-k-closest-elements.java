class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>
		((a,b)->Math.abs(a-x)-Math.abs(b-x)==0?a-b:
		Math.abs(a-x)-Math.abs(b-x));
        
        
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        
        
        ArrayList<Integer> list=new ArrayList<>();
        while(k-->0){
            list.add(pq.poll());
        }
        Collections.sort(list);
        return list;
    }
}