public class day18 {
    static int BinarySearch_first_occurrence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int mid_num = nums[mid];

            if (mid_num == target) {
                ans = mid;
                high = mid - 1;
            } else if (mid_num > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int BinarySearch_last_occurrence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int mid_num = nums[mid];

            if (mid_num == target) {
                ans = mid;
                low = mid + 1;
            } else if (mid_num > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    static int[] findFirstAndLast(int[] nums, int target) {
        int first = BinarySearch_first_occurrence(nums, target);
        int last = BinarySearch_last_occurrence(nums, target);
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 4, 4, 5, 6, 6, 7};
        int target = 4;
        int[] result = findFirstAndLast(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}