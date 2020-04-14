public class Main {
    public static void main(String[] args) {
        IFactory fc1 = new AppleFactory();
        IFactory fc2 = new BananaFactory();

        fc1.creatFruit().eat();
        fc2.creatFruit().eat();
    }

}
