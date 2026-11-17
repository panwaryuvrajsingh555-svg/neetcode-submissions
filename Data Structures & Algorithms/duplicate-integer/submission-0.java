class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        System.out.println(freq);
        for(int i =0;i<nums.length; i++){
          if(freq.get(nums[i])>1){
                return true;
            }
        }
        return false;
    }
    }
