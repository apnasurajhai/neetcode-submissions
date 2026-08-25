class Solution {
    public int trap(int[] height) {
        int res = 0;
       
        int left=0;
        int right=height.length-1;
         int maxL = height[left];
        int maxR=height[right];
        while(left<right){
            if(maxL<maxR){
                left++;
                 maxL=Math.max(maxL,height[left]);
                res+=maxL-height[left];
               
                
            }else {
                 right--;
                 maxR=Math.max(maxR,height[right]);
                res+=maxR-height[right];
                
               
            }
        }
        return res;
    }
}
