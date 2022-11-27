package FunctionMethods;

import java.util.Arrays;

public class ChangrValue {
    public static void main(String[] args) {
        //create array
        int[] arr={1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void change(int[] nums) {
        nums[0]=99;
    }
}
