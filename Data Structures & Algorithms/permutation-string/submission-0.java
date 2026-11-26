class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int [] freq = new int [26];
        for(int i = 0 ; i < s1.length() ; i++){
            freq[s1.charAt(i) -'a']++;
        }
        int windowS = s1.length();
        for(int i  = 0 ; i <= s2.length() ; i++){
int windowIndx = 0 , idx  = i;
    int [] windowFreq = new int [26];
while(windowIndx < windowS && idx < s2.length()){
    windowFreq[s2.charAt(idx)- 'a']++;
    windowIndx++; idx++;
}
if(isFreqSame(freq, windowFreq)){
    return true;
}
        }
        return false;
    }
    public  boolean isFreqSame(int freq1[] , int freq2[]){
        for(int i = 0 ; i < 26 ; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }
    
}
