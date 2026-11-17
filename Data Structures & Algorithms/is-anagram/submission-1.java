class Solution {
    public boolean isAnagram(String s, String t) {
    //     char [] arr1 = s.toCharArray();
    //     char [] arr2 = t.toCharArray();
    //     Arrays.sort(arr1);
    //     Arrays.sort(arr2);
    //    return Arrays.equals(arr1 ,arr2);
     int []  count = new int[26];
     for(char ch : s.toCharArray()){
        count[ch-'a']++;
     }
      for(char ch : t.toCharArray()){
        count[ch-'a']--;
     }
     boolean allZerores  = Arrays.stream(count).allMatch(element -> element == 0);
     return allZerores; 
    }
}
