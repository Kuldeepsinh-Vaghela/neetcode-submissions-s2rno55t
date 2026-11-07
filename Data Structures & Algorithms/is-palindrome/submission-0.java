class Solution {
    public boolean isPalindrome(String s) {
        // check for non alpha numeric character - > return false
        // create 2 varable to track index, first and last
        // compare value for 2 varables and increase i, decrease j
        String nonAlpha = "!@#$%^&*()-_=+[]{};:'\",.<>?|~ ";
        

        int i = 0;
        int j = s.length() - 1;

        while(i <= j){
            if(nonAlpha.contains(String.valueOf(s.charAt(i))) || nonAlpha.contains(String.valueOf(s.charAt(j)))){
                if(nonAlpha.contains(String.valueOf(s.charAt(i)))){
                    i ++;
                }
                if(nonAlpha.contains(String.valueOf(s.charAt(j)))){
                    j--;
                }
                continue;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }

            i ++;
            j --;
        }
        

        return true;
    }
}
