class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSums = new int[nums.length];
        // int[] count = new int[nums.length];  error no count array
        int count = 0;
        for( int i = 0; i < nums.length; i++){
            count = count + nums[i];            //if nums= [1, 3, 5] so this keeps 0, 0+1, 1+3, 4+5
            runningSums[i] = count;
        }
        return runningSums;
    }
}
