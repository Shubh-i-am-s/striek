class Solution {
    public int[] shuffle(int[] nums, int n) {
        int half = nums.length/2;
        int arr1[] = new int[half];
        int arr2[] = new int[(nums.length - half)];
        int arrComb[] = new int[nums.length];

        for ( int i = 0; i < half; i++){
            arr1[i] = nums[i];
        }
        for ( int j = half; j < nums.length; j++){
            arr2[j- half] = nums[j];        //when arr2[3]=nums[3] --> error --> because arr2[1],[2],
            //                          [3] values are not there --> we want arr2 0 1 2 and not 3 4 5 --> as array start from 012
            //                                                  3 4 7           3 4 7
        }
        for ( int k = 0; k < half; k++){
            arrComb[2*k] = arr1[k];
            arrComb[(2*k)+1] = arr2[k];
        }
        return arrComb;
    }
}
