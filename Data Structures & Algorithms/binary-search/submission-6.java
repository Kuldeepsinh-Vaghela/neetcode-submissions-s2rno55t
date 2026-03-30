class Solution {
    public int search(int[] nums, int target) {
        int lp = 0;
        int rp = nums.length-1;

        while(lp <= rp){
            int mid = (rp - lp)/2;
            if(nums[mid + lp] == target){
                return mid + lp;
            }else if(nums[mid + lp] < target){
                lp = mid + lp + 1 ;
            }else{
                rp = mid + lp - 1;
            }
        }
        return -1;
        
    }
}


// class Solution {
//     public int search(int[] nums, int target) {
//         int lp = 0;
//         int rp = nums.length - 1;

//         while (lp <= rp) {
//             // Standard way to find the middle to prevent overflow
//             int mid = lp + (rp - lp) / 2; 

//             if (nums[mid] == target) {
//                 return mid;
//             } else if (nums[mid] < target) {
//                 lp = mid + 1; // Move past the middle
//             } else {
//                 rp = mid - 1; // Move before the middle
//             }
//         }
//         return -1;
//     }
// }