class Solution {
public:



    bool canFinish(vector<int>& piles, int h, int k){

        if (k == 0) return false;
        long long totalHours = 0;

        for(auto pile:piles){
            totalHours += (pile + k - 1)/k;
        }

        return totalHours <= h;
    }



    int minEatingSpeed(vector<int>& piles, int h) { // h = given time
        int max_pile = *max_element(piles.begin(), piles.end());

        int left =1;
        int right = max_pile;
        int mid;
        int ans = max_pile;

        while(left<=right){
            mid = left + (right-left)/2;

            if(canFinish(piles, h, mid)){ // go slower
                ans = mid;   
                right = mid-1;
            }else{
                left = mid+1; //go faster
            }
        }

        return ans;


    }
};