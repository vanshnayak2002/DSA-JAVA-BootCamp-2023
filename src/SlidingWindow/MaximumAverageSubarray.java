package SlidingWindow;
/*Input: nums = [1,12,-5,-6,50,3], k = 4
        Output: 12.75000
        Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75*/

//Sliding Window of Fixed Window Size
public class MaximumAverageSubarray {
    static public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=0;
        double maxi=Integer.MIN_VALUE;
        double avg=0;double sum=0;
        while(j<nums.length)
        {
            sum=sum+nums[j];


            if(j-i+1==k)
            {
                avg=sum/k;
                maxi=Math.max(avg,maxi);
                sum-=nums[i];
                i++;
            }

            j++;
        }
        return maxi;
    }










    public static void main(String[] args) {
     int nums[]={-1,12,-5,-6,50,3} ;
          Double ans= findMaxAverage(nums,4);
        System.out.println(ans);
    }
}
