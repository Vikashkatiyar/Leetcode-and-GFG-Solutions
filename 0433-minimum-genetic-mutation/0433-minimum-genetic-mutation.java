class Solution {
    //Jai Bhole
        class Pair{
            String s;
            int step;
            Pair(String s,int step){
                this.s=s;
                this.step=step;
            }
        }
    
        private int ladderLength(String startWord, String targetWord, String[] wordList) {
            HashSet<String> set=new HashSet<>();
            for(String st:wordList){
                set.add(st);
            }


            //Simple BFS
            LinkedList<Pair> q=new LinkedList<>();
            q.addLast(new Pair(startWord,0));
            set.remove(startWord);

            while(q.size()>0){
                Pair p=q.removeFirst();

                String word=p.s;
                int   steps=p.step;
                if(word.equals(targetWord)){
                    return steps;
                }


                for(int i=0;i<word.length();i++){
                    for(char ch : new char[]{'A','C','G','T'}){
                        char [] replArr=word.toCharArray();
                        replArr[i]=ch;
                        String newStr=new String(replArr);

                        if(set.contains(newStr)){
                            q.addLast(new Pair(newStr,steps+1));
                            set.remove(newStr);
                        }
                    }
                }
            }

            return -1;
        }
    
    public int minMutation(String startGene, String endGene, String[] bank) {
        return ladderLength(startGene,endGene,bank);
    }
}