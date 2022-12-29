class Solution {
    public int[] getOrder(int[][] tasks) {
     PriorityQueue<Task> pq = new PriorityQueue<>((a,b) -> a.prtime == b.prtime?a.id-b.id:a.prtime - b.prtime);
        
     int[] res = new int[tasks.length];
     int resInd = 0;
        
        
     Task[] tar = new Task[tasks.length];
     int i=0;
     for(int[] t:tasks){
         tar[i] = new Task(i,t[0],t[1]);
         i++;
     }
        
     Arrays.sort(tar,(a,b) -> a.start==b.start?(a.prtime!=b.prtime?a.prtime-b.prtime:a.id-b.id):a.start-b.start);

     int end = 0;
     int index=0;
     while(index<tasks.length){
         if(pq.size()>0){
            Task t = pq.remove();
            end = Math.max(t.start,end) + t.prtime;
            res[resInd++] = t.id;
             
             
            while(index<tasks.length && end>=tar[index].start){
                pq.add(tar[index++]);
            }
         }
         else{
             pq.add(tar[index++]);
         }
     }
        
        
    while(pq.size()>0){
        Task t = pq.remove();
        res[resInd++] = t.id;
    }
        
    return res;
    }
}

class Task{
    int id;
    int start;
    int prtime;

    Task(int id,int start,int prtime){
        this.id=id;
        this.start=start;
        this.prtime=prtime;
    }
}