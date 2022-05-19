class Solution {
    public void duplicateZeros(int[] arr) {
       List<Integer> li=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                li.add(arr[i]);
            }
            else
            {
                li.add(arr[i]);
                li.add(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=li.get(i);
        }

    }
}