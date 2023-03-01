package leetcode.programmingSkills.easy.loop;

public class ArraySign {
    public int arraySign(int[] nums) {
        int n = nums.length, count = 0;
        for (int num : nums) {
            if (num == 0)
                return 0;
            else if (num < 0)
                count++;
        }
        if(count % 2 == 0)
            return 1;
        return -1;
    }
}
