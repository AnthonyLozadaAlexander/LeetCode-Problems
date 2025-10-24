public class TwoSum {
    void main() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int firtsIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[firtsIndex] + nums[i] == target) {
                System.out.println("Return Indices: "
                        + "\n" + "[" + firtsIndex + "]"
                        + "\n" + "[" + i + "]");
            }
        }


    }
}
