import java.util.HashMap;
import java.util.Map;


class Solution {
    public int solution(int[] nums) {
    
        Map<Integer, Integer> hashMap = new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
            
            if(!hashMap.containsValue(nums[i])) {
                hashMap.put(i,nums[i]);
            };
            
        };
        
        int size = hashMap.size();
        
        if(size > (nums.length/2)){
            return nums.length/2;
        }
        else return size;

    }
}