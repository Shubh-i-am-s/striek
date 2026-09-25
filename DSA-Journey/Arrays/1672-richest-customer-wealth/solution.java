class Solution {
    public int maximumWealth(int[][] accounts) {
        //int max=0;
        int[] max = new int [accounts.length];
        for( int i = 0; i < accounts.length; i++ ){
            int currrentWealth = 0;
            for( int j = 0; j < accounts[i].length; j++ ){
                currrentWealth = currrentWealth + accounts[i][j];
            }
            max[i] = currrentWealth;
        }
        int maxm = max[0];
        for( int k = 0; k < accounts.length; k++ ){
            if(maxm < max[k] ){
                maxm = max[k];
            }
        }
        return maxm;
    }
}
