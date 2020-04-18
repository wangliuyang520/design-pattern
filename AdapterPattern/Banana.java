public class Banana implements IFriut {
    private String fruitName;

    public Banana(String fruitName) {
        this.fruitName = fruitName;
    }

    @Override
    public void eat() {
        System.out.println("吃香蕉");
    }
    public String getFruitName(){
        return fruitName;
}}
