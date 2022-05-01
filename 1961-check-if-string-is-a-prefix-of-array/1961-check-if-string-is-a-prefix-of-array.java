class Solution {
    public boolean isPrefixString(String s, String[] words) {
        
//            StringBuffer sb= new StringBuffer();
//             for (int i = 0; i < array.length ; i++) {
//                 sb.append(array[i]);
               
//             }
            
//            if(sb.toString().equals(s)){
//               return true;
//            }
//            else{
//             return false;
//           }
           StringBuffer sb=new StringBuffer();
            for(int i=0;i<words.length;i++)
            {
            sb.append(words[i]);
            if(sb.toString().equals(s))
            return true;
            }
            return false;
    }
}