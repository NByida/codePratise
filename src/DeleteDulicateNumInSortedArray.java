import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

/**
 * 给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
 *
 * 由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。更规范地说，如果在删除重复项之后有 k 个元素，那么 nums 的前 k 个元素应该保存最终结果。
 *
 * 将最终结果插入 nums 的前 k 个位置后返回 k 。
 *
 * 不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/remove-duplicates-from-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class DeleteDulicateNumInSortedArray {

    public static void main(String[] ars){
        int[] dulicateAyyat={1,1,2,3,4};
        int res= deleteDulicateNum2(dulicateAyyat);
        for (int i = 0; i < res; i++) {
            System.out.println(dulicateAyyat[i]);
        }

        float scaleHeight = ((float) 2) / 3;
        float scaleHeight2 = ((float) 2 / 3);
        float scaleHeight3 = ((float) 2 / (float) 3);


        System.out.println("scaleHeight  " + scaleHeight);
        System.out.println("scaleHeight2 " + scaleHeight2);
        System.out.println("scaleHeight3 " + scaleHeight3);



    }

    /**
     *
     * 快慢指针删除重复元素
     * @param array
     * @return
     */

    private static int deleteDulicateNum2(int[] array) {
        int fast = 1;
        int slow = 1;
        while (fast < array.length) {
            if (array[fast - 1] != array[fast]) {
                array[slow] = array[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    private static int[] deleteDulicateNum(int[] array) {
        HashMap map = new HashMap<Integer, Integer>();
        int dulicateNum=0;
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], i-dulicateNum);
            }else {
                dulicateNum++;
            }
        }
        Set set = map.keySet();
        Iterator it = set.iterator();
        int[] res=new int[map.size()];
        while (it.hasNext()) {
            int key = (int) it.next();
            int value = (int) map.get(key);
            res[value] = key;
        }
        return res;
    }

}
