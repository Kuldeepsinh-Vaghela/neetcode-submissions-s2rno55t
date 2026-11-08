class Solution {
    public int search(int[] nums, int target) {
        int lp = 0;
        int rp = nums.length - 1;
        int ans = 0;
        if(nums.length == 1 ){
            if(nums[0] != target){
                return -1;
            }else{
                return 0;
            }
            
        }
        if(nums.length == 0){
            return -1;
        }
        if(nums.length == 2){
            if(nums[0] > target){
                return -1;
            }else{
                if(nums[0] == target){
                    return 0;
                }else if(nums[1]== target){
                    return 1;
                }else{
                    return -1;
                }
            }
        }
        while (nums[ans + ((rp - lp) / 2)] != target){
            if(nums[ans + ((rp - lp) / 2) ] < target){
                lp = ans + ((rp - lp) / 2) + 1;
                ans = lp;
                if(lp > nums.length - 1){
                    return -1;
                }
            }else{
                rp = ans + ((rp - lp) / 2) - 1 ;
                if(rp < 0){
                    return -1;
                }
            }
            if(lp == rp){
                if(nums[lp] != target){
                    
                    return -1;    
                }else{
                    return ans;
                }
            }
        }
        return ans + ((rp - lp) / 2);
    }
}
