public class OverloadingRevisited {

    public static void main(String[] args) {

        m1(45);


    }

    //public static void m1(int i){
      //  System.out.println("int");
    //}

    public static void m1(long i){
        System.out.println("long");
    }

    public static void m1(Double i){
        System.out.println("Double");
    }
    public static void m1(Long i){
        System.out.println("Long Wrapper");
    }
    public static void m1(Integer i){
        System.out.println("Integer Wrapper");
    }

    public static void m1(int... i){
        System.out.println("Varargs");
    }
}

