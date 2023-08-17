public class Reverse_integer {


    /**
     *
     * 整数反转
     *
     * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
     *
     * 如果反转后整数超过 32 位的有符号整数的范围 [−231,231 − 1] ，就返回 0。
     *
     * 假设环境不允许存储 64 位整数（有符号或无符号）。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/reverse-integer
     * @param ars
     */

    public static void main(String[] ars){
        System.out.println(resverInterger(-123));
        System.out.println(resverInterger(-1));
        System.out.println(resverInterger(1111111222));
    }


    /**
     *  10012
     * @param num
     */
    private static int resverInterger(int num) {
        int remain = num;
        if (num < 0) {
            remain = -1 * num;
        } else if (num < 10) {
            return num;
        }
        int reverse = 0;
        int max = (int) (Integer.MAX_VALUE/10);
        while (remain > 0) {
            if (reverse >max) {
                return num;
            }
            reverse = 10 * reverse + remain % 10;
            remain = remain / 10;
        }
        if (num < 0) {
            reverse = -1 * reverse;
        }
        return reverse;
    }
}
