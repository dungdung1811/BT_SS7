package BT.b1;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("NGUYEN VAN DUNG");
        System.out.println(myClass.getMyString());
        myClass.setMyString("BAi TAP cua NGUYEN VAN DUNG");
        System.out.println(myClass.getMyString());
    }
}
