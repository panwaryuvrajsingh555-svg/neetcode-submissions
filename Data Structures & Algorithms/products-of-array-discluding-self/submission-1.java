class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n = nums.length;
        int [] ans = new int[n];
        // for(int i = 0; i < n; i++){
        //     int mul = 1;
        //     for(int j = 0 ; j < n; j++){
        //         if(i != j){
        //         mul = mul*nums[j];
        //     }
        // }
        // ans[i] = mul;
        // }
        // return ans; 
        // tle error
         int left = 1;

        // Calculate left products
        for(int i = 0; i < n; i++){
            ans[i] = left;
            left *= nums[i];
        }

        int right = 1;

        // Multiply with right products
        for(int i = n-1; i >= 0; i--){
            ans[i] *= right;
            right *= nums[i];
        }

        return ans;
    }
}