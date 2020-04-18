public class Apple implements IFriut {
    private String fruitName;

    public Apple(String fruitName) {
        this.fruitName = fruitName;
    }

    @Override

    public void eat() {
        System.out.println("吃苹果");
    }

    public String getFruitName() {
        return fruitName;
    }
}
