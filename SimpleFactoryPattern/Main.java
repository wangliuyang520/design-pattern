public class Main {
    public static void main(String arg[]){
        Factory fc =new Factory();
        IFriut f1=fc.createFruit("Apple");
        IFriut f2=fc.createFruit("Banana");
        f1.eat();
        f2.eat();
    }

}
