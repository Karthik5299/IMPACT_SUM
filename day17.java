
//leetcode 162. Find Peak Element
public class day17 {
    // public int findPeakElement(int[] nums) {
    //     int low =0;
    //     int high=nums.length-1;

    //     while(low<high){
    //         int mid = (low+high)/2;
    //         if(nums[mid]>nums[mid+1]){
    //             high=mid;
    //         }
    //         else{
    //             low=mid+1;
    //         }
    //     }
    //     return low;
    // }

    //leetcode 704. Binary Search
    // public int search(int[] nums, int target) {
    //     int low=0;
    //     int high=nums.length-1;

    //     while(low<=high){
    //         int middle_position=(low+high)/2;
    //         int middle_num = nums[middle_position];

    //         if(target==middle_num){
    //             return middle_position;
    //         }
    //         else if(target<middle_num){
    //             high=middle_position-1;
    //         }
    //         else{
    //             low=middle_position+1;
    //         }
    //     }
    //     return -1;
    // }
    //leetcode 69. Sqrt(x)
//     class Solution {
//     public int mySqrt(int x) {
//         if(x==0||x==1){
//             return x;
//         }
//         int low=0;
//         int high=x;
//         int ans=-1;

//         while(low<=high){
//             int mid=(low+high)/2;
//             if(mid*mid==x){
//                 return mid;
//             }
//             if((long)mid*mid>x){
//                 high =mid-1;
//             }
//             else{
//                 ans=mid;
//                 low=mid+1;
//             }
//         }

//         return Math.round(ans);
//     }
// }

//leetcode 283. Move Zeroes
//   public void moveZeroes(int[] nums) {
//         int left=0;
//         for(int right=0;right<nums.length;right++){
//             if(nums[right]!=0){
//                 int temp = nums[right];
//                 nums[right]=nums[left];
//                 nums[left]=temp;
//                 left++;
//             }
//         }
//     }
}
