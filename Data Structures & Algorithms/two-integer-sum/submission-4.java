class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int [] ans = new int [2];
        // for(int i = 0; i< nums.length ; i++){
        //     for(int j = i+1 ; j < nums.length ; j++){
        //         if(nums[i] + nums[j] == target){
        //          ans =  new int[]{i , j};
        //          return ans;
        //         }
        //     }
        // }
        // return ans;
    
HashMap<Integer, Integer> map = new HashMap<>();

for(int i = 0; i < nums.length; i++) {

    int complement = target - nums[i];

    if(map.containsKey(complement)) {
         return new int[]{map.get(complement), i};
        // Return both indices here

    }
     map.put(nums[i], i);

    // Store current number and its index here

}

return new int[]{};
    }
}