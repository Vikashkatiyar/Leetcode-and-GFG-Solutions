class OrderedStream {
    String[] res;
    int ptr;

    public OrderedStream(int n) {
        res=new String[n];
        ptr=0;
    }
    
    public List<String> insert(int idKey, String value) {
        res[idKey-1]=value;
        List<String> ans=new ArrayList<>();
        while(ptr<res.length && res[ptr]!=null){
            ans.add(res[ptr++]);
        }
        return ans;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */