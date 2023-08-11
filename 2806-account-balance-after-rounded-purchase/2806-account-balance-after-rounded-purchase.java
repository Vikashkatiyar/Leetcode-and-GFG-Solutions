class Solution {
    public int accountBalanceAfterPurchase(int p) {
        int leftNum=(p/10)*10; //Gave the just less multiple of p
        int rightNum=leftNum+10;  //Gave the just greater multiple of p
        
        return 100-(p-leftNum!=rightNum-p?(p-leftNum<rightNum-p?leftNum:rightNum):rightNum);
    }
}