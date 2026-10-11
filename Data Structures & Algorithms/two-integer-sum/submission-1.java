class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> dict = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int rem = target - nums[i];
            if(dict.containsKey(rem)){
                return new int[]{dict.get(rem),i};
            }
            dict.put(nums[i],i);
        }
        return new int[0];
    }
}
