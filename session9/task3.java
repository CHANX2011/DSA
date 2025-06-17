package session9;

public class task3 {
	public static int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int last = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                last = mid;
                left = mid + 1; 
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    }

   
    public static int countOccurrences(int[] nums, int target) {
        int first = findLast(nums, target);
        if (first == -1) return 0; 
        int last = findLast(nums, target);
        return last - first + 1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        int count = countOccurrences(sortedArray, target);
        System.out.println("Count of " + target + " is: " + count);
    }
}


