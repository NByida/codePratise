import java.util.Arrays;


/**
 *
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/remove-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class remove_element_submissions {

    public static void main(String[] ars) {
        int l=0,r=0,equal=0;
        int[] nums={0,4,4,0,4,4,4,0,2};
        int val=4;

        while(r<nums.length){
            if(val!=nums[r]){
                nums[l]=nums[r];
                l++;
            }
            r++;
        }

        System.out.println(Arrays.toString(nums));
    }
}
