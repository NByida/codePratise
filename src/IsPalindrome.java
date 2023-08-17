public class IsPalindrome {

    /**
     *
     * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
     *
     * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     *
     * 例如，121 是回文，而 123 不是。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/palindrome-number
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param ars
     */

    public static void main(String[] ars){
        boolean res= isPalindrom(121);
        System.out.println(res);
    }


    public static boolean isPalindrome(int x) {
        String num = ((Integer) x).toString();
        num = num.replace("-", "");
        for (int l = 0, r = num.length() - 1; l < r; l++, r--) {
            if (num.charAt(l) != num.charAt(r)) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param x
     * @return
     */
    public static boolean isPalindrom(int x) {
        if (x < 10 && x >= 0) {
            return true;
        }
        if (x % 10 == 0 || x < 0) {
            return false;
        }
        int l = x, r = 0;
        // 从右边开始反转
        while (r < l) {
            r = r * 10 + l % 10;
            l = l / 10;
        }
        return l == r || r / 10 == l;
    }


}
