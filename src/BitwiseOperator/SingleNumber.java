package Arrays;

public class SingleNumber {
    public static void main(String[] args) {
//        int[] arr={2,3,3,4,2,6,4};
        int[] arr={2,2,3,2,5};//ans 3// tyry to solve this
        System.out.println(ans(arr));//ans 6
    }
    private static int ans(int[] arr){
        int unique=0;
        for (int n:arr){
            unique^=n;
        }
        return unique;
    }
}
//nput: nums = [1,2,1,3,2,5] // 3rd que
//Output: [3,5]
//Explanation:  [5, 3] is also a valid answer.