class Solution {
    public int search(int[] nums, int target) {
        int lp = 0;
        int rp = nums.length-1;

        while(lp < rp){
            int mid = (rp - lp)/2;
            if(nums[mid + lp] == target){
                return mid + lp;
            }else if(nums[mid + lp] < target){
                lp = mid + 1;
            }else{
                rp = mid - 1;
            }
        }
        return -1;
        
    }
}
