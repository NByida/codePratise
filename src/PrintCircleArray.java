import java.util.Arrays;

/**
 * 打印环形数组
 */
public class PrintCircleArray {


    /**
     * 1,2,3,4
     * 5,6,7,8
     * 9,10,11,12
     * 13,14,15,16
     *
     * @param ars
     */
    public static void main(String[] ars) {
        int[][] test = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] test2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//        printArray(test);

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


    private static void printArray(int[][] array) {
        for (int l = 0, r = array[0].length, t = 0, b = array.length
             ; l < r && t < b; l++, r--, t++, b--) {
            System.out.println("");
            for (int i = l; i < r; i++) {
                System.out.print(array[l][i]);
                System.out.print(",");
            }
            System.out.println("");
            for (int i = t + 1; i < b; i++) {
                System.out.print(array[i][r - 1]);
                System.out.print(",");
            }
            System.out.println("");
            for (int i = r - 2; i > l; i--) {
                System.out.print(array[b - 1][i]);
                System.out.print(",");
            }
            System.out.println("");
            for (int i = b - 1; i > t; i--) {
                System.out.print(array[i][l]);
                System.out.print(",");
            }
        }
    }


}


