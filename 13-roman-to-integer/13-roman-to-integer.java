class Solution {
    public int romanToInt(String s) {
        //o(N)
        //o(1)
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int res = 0;
        int prev = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(map.get(s.charAt(i)) >= prev){
                res += map.get(s.charAt(i));
                prev = map.get(s.charAt(i));
            }
            else res -= map.get(s.charAt(i));
        }
        
        return res;

    }
}