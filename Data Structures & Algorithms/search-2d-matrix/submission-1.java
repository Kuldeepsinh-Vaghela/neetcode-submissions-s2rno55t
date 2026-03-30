class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i =0; i < matrix.length; i ++){
            int[] inner = matrix[i];
            if(inner[inner.length-1] < target){
                continue;
            }else if(inner[inner.length-1] == target){
                return true;
            }else{
                for(int j = 0; j < inner.length; j++){
                    if(inner[j] == target){
                        return true;
                    }
                }
                
            }
        }
        return false;
    }
}
