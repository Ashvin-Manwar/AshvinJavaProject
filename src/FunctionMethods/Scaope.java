package FunctionMethods;

public class Scaope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        {
             a=88;// REasssign the originaal ref variable to some other values
             int c=99;
            // values initialise in this block , will remain in block
        }
//        System.out.println(c);// cannot use outside the block
    }
    static  void  random(int marks){
        int num=67;
        System.out.println(num);
        System.out.println(marks);
    }
}
