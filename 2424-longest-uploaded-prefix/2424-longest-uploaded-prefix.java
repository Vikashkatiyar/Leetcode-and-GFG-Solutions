class LUPrefix {
    int[] arr;
    int ptr;
    
    public LUPrefix(int n) {
        arr=new int[n];
        ptr=0;
        
    }
    
    public void upload(int video) {
        arr[video-1]=1;
    }
    
    public int longest() {
        
        
        while(ptr<arr.length && arr[ptr]==1){
            ptr++;
           
        }
       return ptr;
    }
}

/**
 * Your LUPrefix object will be instantiated and called as such:
 * LUPrefix obj = new LUPrefix(n);
 * obj.upload(video);
 * int param_2 = obj.longest();
 */