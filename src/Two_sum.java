import java.util.Arrays;
import java.util.HashMap;

public class Two_sum {


    /**
     *    给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
     *
     *     你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
     *
     *     你可以按任意顺序返回答案。
     *
     *     来源：力扣（LeetCode）
     *     链接：https://leetcode.cn/problems/two-sum
     * @param ars
     */
    public static void main(String[] ars){
        int[] test={1,3,5,7,9,29,19,2,91};
        int[] res=twoSun(test,92);
        System.out.println(Arrays.toString(res));
    }

    /**
     * 使用hashmap存放数据，key存放数值，value存放下标
     * 获取key，target-key 是否存在的复杂度为 O（1）
     */
    private static int[] twoSun(int[] numbs, int target) {
        HashMap map = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i = 0; i < numbs.length; i++) {
            if (map.containsKey(target - numbs[i])) {
                res[1] = i;
                res[0] = (int) map.get(target - numbs[i]);
                break;
            } else {
                map.put(numbs[i], i);
            }
        }

        return res;
    }





}
