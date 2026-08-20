class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int num:nums){
            hs.add(num);
        }

        for(int num:nums){
            if(!hs.contains(num-1)){
            int longest=0;
            int curr = num;
            while(hs.contains(curr)){
                longest++;
                curr++;
            }


            ans = Math.max(longest,ans);
            }
        }

        return ans;
    }
}
