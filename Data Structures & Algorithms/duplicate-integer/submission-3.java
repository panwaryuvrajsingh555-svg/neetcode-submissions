class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Set<Integer> seen = new HashSet<>();
        // for (int i = 0; i < nums.length; i++) {
        //     if (seen.contains(nums[i])) {
        //         return true;
        //     }
        //     seen.add(nums[i]);
        // }
        // return false;
       HashMap<Integer , Integer> freq = new HashMap<>();
       for(int num : nums){
        freq.put(num , freq.getOrDefault(num , 0)+1);
       } 
       for(int i = 0 ; i< nums.length ; i++){
         if(freq.get(nums[i]) > 1){
return true;
         }
       }
       return false;
    }
}