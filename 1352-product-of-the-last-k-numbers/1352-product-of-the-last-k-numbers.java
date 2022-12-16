class ProductOfNumbers {
    List<Integer> list;
    int prifixpd;
    public ProductOfNumbers() {
      list=new ArrayList<>();
        prifixpd=1;
    }
    
    public void add(int num) {
        if(num==0){
            list=new ArrayList<>();
            prifixpd=1;
        }else{
            prifixpd*=num;
            list.add(prifixpd);
        }
        
    }
    
    public int getProduct(int k) {
        int n=list.size();
        
        if(k==n){
            return prifixpd;
        }else if(k>n){
            return 0;
        }else{
            return prifixpd/list.get(n-k-1);
        }
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */