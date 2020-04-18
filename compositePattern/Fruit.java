public class Fruit extends  MyElement {
    protected String fruitName;

    @Override
    void eat() {
        System.out.println("吃"+fruitName);
    }
}
