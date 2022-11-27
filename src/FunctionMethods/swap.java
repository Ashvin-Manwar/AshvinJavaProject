package FunctionMethods;

public class swap {
    public static void main(String[] args) {
        int a=10;;
        int b=200;
//        //swap no code
//        int temp =a;
//        a=b;
//        b=temp;

        swap(a,b);
        System.out.println(a+ " "+ b);
        String name="Ashvin Manwar";
        changename(name);
        System.out.println(name);
    }

    private static void changename(String name) {
        name="Rahul Rana";
    }

    static  void swap(int a, int b){
        int temp =a;
        a=b;
        b=temp;
        // this change will only be valid in this functionn only
    }
}
