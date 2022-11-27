package StringsBasics;

public class stringBasics {
    public static void main(String[] args) {
        String str = "abcd";
        String s = new String("abcd");// create new address
        System.out.println(str == s);
        System.out.println(str.equals(s));
        System.out.println(str);
        System.out.println(str.charAt(2));
        System.out.println(str.length());
        // SubString
//        String x=str.substring(1);//bcd
//        String x1=str.substring(1,3);//bd
//        System.out.println(x);
//        System.out.println(x1);
//        String v=""+"xyz";
//        String v1="".concat(v);
//        System.out.println(v1);
//        System.out.println(v+"abc");
//           int[] arr=new int[1];
//           int[] arr2=new int[2];
//        System.out.println(arr);
//        System.out.println(arr2);
    }
}
