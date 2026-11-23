class Solution {
    public int maxArea(int[] heights) {
   int maxArea = 0;
int i = 0;
int j = heights.length-1;
while( i < j){


        int h = Math.min(heights[i], heights[j]);
       
        int width = j - i;

        int area = h * width;

        maxArea = Math.max(maxArea, area);
         if(heights[i] >  heights[j]){
            j--;
        }else{
            i++;
        }
        
    }
    
    return maxArea;
}
}