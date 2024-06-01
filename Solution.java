class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> seen = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                seen.add(nums[i]);
                k = 0;
            } else {
                k++;
                if (k <= seen.size()) {
                    ans.add(seen.get(seen.size()-k));
                } else {
                    ans.add(-1);
                }
            }
        }
        return ans;
    }
}
