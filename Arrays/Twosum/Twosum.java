// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


public class Twosum {
    public static int[] twoSum(int[] nums, int target) {

        int n=nums.length;
        int ans[]=new int[2];

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){

                if(nums[i]+nums[j] == target){
                    ans[0]=i;
                    ans[1]=j;
                    break;
                }

            }
           

        }

        return ans;

        
    }
    
    public static void main(String[] args) {

        int arr[]={2,7,11,15};
        int target=9;

        for(int i:twoSum(arr,target)){
            System.out.println(i);
        }
        
    }
    
}
