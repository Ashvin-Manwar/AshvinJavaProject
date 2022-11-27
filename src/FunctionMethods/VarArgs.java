package FunctionMethods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,56,666,78,45);
        multiple(2,2,"Ahvin","Rahul");
    }
    static  void multiple(int a,int b,String ...v){

    }
    static  void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
