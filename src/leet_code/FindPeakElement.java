package leet_code;
//https://leetcode.com/problems/find-peak-element/

public class FindPeakElement {
    public static void main(String[] args){
        int[] nums = {1,2,1,3,5,6,4};
        int ans = findPeakElement(nums);
        System.out.println(ans);
    }

    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length -1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] < nums[mid + 1]){
                start = mid + 1;
            }
            else if(nums[mid] > nums[mid + 1]){
                end = mid;
            }
        }
        return start;
    }
}
