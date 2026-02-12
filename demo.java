class mobile{
    String brand;
    int price;
    static String name;
    public void show(){
        System.out.println(brand+":"+price +":"+name);
    }
}
    public class demo{

    public static void main(String[] args) {

        mobile obj1=new mobile();
        obj1.brand="apple";
        obj1.price=70000;
        obj1.name="cellphone";

        mobile obj2=new mobile();
        obj2.brand="vivo";
        obj2.price=30000;
        obj2.name="cellphone";

        obj1.name="phone";

        obj1.show();
        obj2.show();
        
    }
}