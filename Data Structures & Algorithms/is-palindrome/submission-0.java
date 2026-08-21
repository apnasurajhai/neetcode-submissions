class Solution {
    public boolean isPalindrome(String s) {
        char []c = s.toCharArray();
        int start =0;
        int end = c.length-1;

        while(start<end){
            if(!Character.isLetterOrDigit(c[start]) ){
                start++;
                continue;
            }
            if(!Character.isLetterOrDigit(c[end])){
                end--;
                continue;
            }
            if(Character.toLowerCase(c[start]) != Character.toLowerCase(c[end])){
                return false;
            }
            start++;
            end--;
        }

        return true;
        
    }
}
