
//static variable and methods
//1) static methods can access static stuff (variables and methods) directly ( without object).
//2) static methods can access non-static stuff (variables and methods) through object
//3) non-static methods can access everything directly.

package java_concept;

public class StaticExample {
    static int a =10;       //static variable
    int b=20;               //non-static variable

    static public void m1(){// static method
        System.out.println("This is m1 static method");
    }
    public void m2(){ //non-static method
        System.out.println("This is m2 non-static method");
    }
    void m3(){ //3) non-static methods can access everything directly.
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }

//    public static void main(String[] args) {
//
//        System.out.println(a);  //1) static methods can access static stuff directly ( without object)
//        // System.out.println(b);   // incorrect , bcoz b is non-static variable
//
//       m1();
//       //m2(); // Nincorrect , bcoz m2() is non-static method
//
//
//        //2) static methods can access non-static stuff through object
//        StaticExample se = new StaticExample();
//        System.out.println(se.b);
//        se.m2();
//    }
}
