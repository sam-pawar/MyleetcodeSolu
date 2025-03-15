class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        
        for(int x = 0 ; x<nums.length -1 ; x++){
            for(int i =x +1; i<nums.length; i++){
               if(target == nums[x] + nums[i]){
                    arr[0] = x;
                    arr[1] = i;
               }
            }
        
        }
        return arr;
    }
}

