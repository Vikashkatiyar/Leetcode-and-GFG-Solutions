class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> Heap = new PriorityQueue(Collections.reverseOrder());
        for(int n: stones) {
            Heap.add(n);
        }
        while(Heap.size() > 1){
            int stone1 = Heap.poll();
            int stone2 = Heap.poll();
            if(stone1 != stone2){
                Heap.add(stone1 - stone2);
            }
        }
        return Heap.size() == 1? Heap.peek() : 0;
    }
}