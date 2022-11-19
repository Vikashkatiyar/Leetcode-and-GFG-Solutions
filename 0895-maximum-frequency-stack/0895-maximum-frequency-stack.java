class FreqStack {
    HashMap<Integer,Integer> fmap;
    HashMap<Integer,Stack<Integer> > smap;
    int mfreq;
    public FreqStack() {
       fmap=new HashMap<>();
        smap=new HashMap<>();
        mfreq=0;
    }
    
    public void push(int val) {
        fmap.put(val,fmap.getOrDefault(val,0)+1);
        int freq=fmap.get(val);
        mfreq=Math.max(mfreq,freq);
        if(!smap.containsKey(freq)){
            smap.put(freq,new Stack<Integer>());
            
        }
        smap.get(freq).push(val);
    }
    
    public int pop() {
        int res=smap.get(mfreq).pop();
        fmap.put(res,fmap.get(res)-1);
        if(smap.get(mfreq).size()==0){
            mfreq--;
        }
        return res;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */