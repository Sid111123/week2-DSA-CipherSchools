import java.util.*;

public class Lecture15
{
    int a = 7; // default = can accessible only with in class and package
    public int b = 12; // public = can accessible with in class, package, outside package, outside subclass
    private int c = 4; // private = can accessible with in class only
    protected int d = 5; // protected = can accessible with in class, package, outside subclass

    public static void main(String ar[])
    {
        Lecture15 obj = new Lecture15();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}
