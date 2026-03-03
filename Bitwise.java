class Bitwise{
    public static void main(String[] args) {

        int x = 12;
        int y = 10;

        System.out.println("AND: " + (x & y));
        System.out.println("OR: " + (x | y));
        System.out.println("XOR: " + (x ^ y));
        System.out.println("NOT x: " + (~x));
        System.out.println("NOT x: " + (~y));
        System.out.println("Left Shift: " + (x << 2));
        System.out.println("Right Shift: " + (x >> 2));  
    }
}