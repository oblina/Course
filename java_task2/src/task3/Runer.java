package task3;

public class Runer {
    public static void main(String[] args){
        A a = new A();
        a.print();
        System.out.println(a.getText());
        B b = new B();
        b.print();
        A ab = new B();
        ab.print();

    }
}
