public class UnaryExample{
    public static void main(String[] args) {
        int a=10;

        System.out.println("Unary Plus :" + (+a));

        System.out.println("Unary Minus :" + (-a));

        System.out.println("Pre increment :" + (++a));

        System.out.println("Post increment :" + (a++));
        System.out.println("After increment :" + a);

        System.out.println("Pre decrement :" + (--a));

        System.out.println("Post decrement :" + (a--));
        System.out.println("After decrement :" + a);
    }
}