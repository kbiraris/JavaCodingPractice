package java_concept;

//import static java_concept.StaticExample.a;
//import static java_concept.StaticExample.m1;

public class StaticMain {

    public static void main(String[] args) {
        //We can access static member of other class by giving reference of that class
        //or
        //we can add static import like
        //import static java_concept.StaticExample.a;
        //import static java_concept.StaticExample.m1;
        System.out.println(StaticExample.a);

        // System.out.println(b);   // incorrect , bcoz b is non-static variable

        //We can access static member of other class by giving reference of that class.
        StaticExample.m1();
        //m2(); // Nincorrect , bcoz m2() is non-static method


        //2) static methods can access non-static stuff through object
        StaticExample se = new StaticExample();
        System.out.println(se.b);
        se.m2();
    }
}
