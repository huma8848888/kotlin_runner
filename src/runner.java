import java.util.Arrays;

public class runner {
    public static void main(String[] args) {
        int[] nums = {1,23,4,56,6,6,7,7,5,4,3,3};
//        sort(nums);
        boolean result = find(nums, 0);
        System.out.println(result);

//        for (int a : nums) {
//            System.out.println(a);
//        }
    }
    public static void sort(int[] nums){
        if(nums.length == 0) return;
        for(int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    }

    public static boolean find(int[] nums, int target){
        if(nums.length == 0) return false;
        int startIndex = 0;
        int endIndex = nums.length - 1;
        Arrays.sort(nums);
        while(startIndex <= endIndex){
            int mid = startIndex + (endIndex - startIndex) / 2;
            if(nums[mid] == target){
                return true;
            } else if(nums[mid] < target){
                startIndex = mid + 1;
            } else {
                endIndex = mid - 1;
            }
        }
        return false;
    }
}
