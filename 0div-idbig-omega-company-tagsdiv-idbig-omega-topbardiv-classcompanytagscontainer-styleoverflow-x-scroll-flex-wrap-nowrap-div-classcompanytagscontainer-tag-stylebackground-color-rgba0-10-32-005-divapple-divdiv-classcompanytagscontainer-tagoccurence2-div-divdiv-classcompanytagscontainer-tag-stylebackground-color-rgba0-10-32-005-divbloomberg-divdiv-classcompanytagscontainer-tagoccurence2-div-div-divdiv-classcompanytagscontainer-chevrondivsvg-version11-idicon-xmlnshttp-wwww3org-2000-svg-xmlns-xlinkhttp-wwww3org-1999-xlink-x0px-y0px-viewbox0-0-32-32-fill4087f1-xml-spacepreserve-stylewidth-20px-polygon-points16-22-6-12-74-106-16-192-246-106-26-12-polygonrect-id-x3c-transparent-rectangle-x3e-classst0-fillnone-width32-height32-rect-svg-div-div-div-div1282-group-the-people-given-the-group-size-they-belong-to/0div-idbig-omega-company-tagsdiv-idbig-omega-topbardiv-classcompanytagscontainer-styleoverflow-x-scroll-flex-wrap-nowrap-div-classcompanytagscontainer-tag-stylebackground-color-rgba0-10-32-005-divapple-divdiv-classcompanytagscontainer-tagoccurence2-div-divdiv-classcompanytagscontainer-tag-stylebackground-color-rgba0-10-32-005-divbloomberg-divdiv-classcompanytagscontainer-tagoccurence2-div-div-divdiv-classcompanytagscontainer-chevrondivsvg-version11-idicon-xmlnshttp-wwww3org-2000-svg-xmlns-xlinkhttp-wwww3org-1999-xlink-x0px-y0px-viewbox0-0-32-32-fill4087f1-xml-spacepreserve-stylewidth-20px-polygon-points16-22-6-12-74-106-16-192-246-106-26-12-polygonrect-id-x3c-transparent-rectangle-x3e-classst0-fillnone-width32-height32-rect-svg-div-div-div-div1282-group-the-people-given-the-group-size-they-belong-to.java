class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        //Jai Shree Ram
        HashMap<Integer, List<Integer>> map=new HashMap<>();
        List<List<Integer>> list=new ArrayList<>();
        
        for(int i=0;i<groupSizes.length;i++){
            int size=groupSizes[i];
            
            List<Integer> temp=map.getOrDefault(size,new ArrayList<>());
            temp.add(i);
            map.put(size,temp);
            
            if(temp.size()==size){
                list.add(temp);
                map.remove(size);
            }
        }
        
        return list;
    }
}