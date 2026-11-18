class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
              map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int [] ans = new int[k];
        for(int i = 0; i < k; i++) {
    int maxFreq = 0;
    int element = 0;

   for(int key : map.keySet()) {

    int frequency = map.get(key);

    if(frequency > maxFreq) {
        maxFreq = frequency;
        element = key;
    }
}
    ans[i] = element;

    // Remove selected element
    map.remove(element);

    }
    return ans;
}
}