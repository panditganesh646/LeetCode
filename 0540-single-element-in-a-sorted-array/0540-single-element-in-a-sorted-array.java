class Solution {
    public int singleNonDuplicate(int[] nums) {
        int xorSum = 0;
           for(int i:nums){
                 xorSum = xorSum^i;
           }
           return xorSum;
    }
}