class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
           
           
         if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k = nums.length-1;
            while(j<k){
                 List<Integer> temp = new ArrayList<>();
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    temp.add(nums[i]);
                     temp.add(nums[j]);
                      temp.add(nums[k]);
                      j++;
                      k--;
                       res.add(temp);
                      while(j<k && nums[j]==nums[j-1]) j++;
                      
                }else if(sum>0){
                    k--;
                }else if(sum<0){
                    j++;
                }
            }
           


        }

        return res;
        
    }
}
