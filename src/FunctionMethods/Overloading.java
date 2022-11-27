package FunctionMethods;

public class Overloading {
    public static void main(String[] args) {
//    fun(55);
//    fun("Ashvin");
        System.out.println( sum(4,99));
        System.out.println(sum(9,44,41));
    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    static void fun(int a){
        System.out.println("First one");
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);
    }
}
