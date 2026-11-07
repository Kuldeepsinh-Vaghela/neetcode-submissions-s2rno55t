class Solution {
    public boolean hasDuplicate(int[] nums) {
        //HashMap<Integer, Integer>  mapVal = new HashMap<>();
        //for(int num : nums){
        //    if(mapVal.get(num) != null){
        //        return true;
        //   }
        //    mapVal.put(num,1);
        //}
        //return false;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
            
        }
        return false;
    }
}