class Solution {
public:
    bool checkSubarraySum(vector<int>& nums, int k) {
        
        unordered_map<int, int> mp;
        mp[0] = -1;   // remainder 0 seen before array starts
        
        int sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            sum += nums[i];

            int rem = (k == 0) ? sum : sum % k;

            if (mp.count(rem)) {
                if (i - mp[rem] >= 2) return true;
            } 
            else {
                mp[rem] = i;
            }
        }

        return false;
    }
};