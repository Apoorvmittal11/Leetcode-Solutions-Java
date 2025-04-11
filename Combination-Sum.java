class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        func(0 , candidates , target , new ArrayList<>() , result);      
        return result;
    }
    public void func(int i,int[]nums,int target,List<Integer>list ,ArrayList<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(list));
            return;
        }
        if(target < 0 || i >= nums.length) return;
        
        list.add(nums[i]);
        func(i , nums , target-nums[i] , list , result);
        list.remove(list.size() - 1);
        func(i+1 , nums , target , list , result);
    }
}