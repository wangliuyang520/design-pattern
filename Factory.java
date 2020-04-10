public class Factory {
    public IFriut createFruit(String fruitName){
        if("Apple".equals(fruitName)) return new Apple();
        else if("Banana".equals(fruitName)) return new Banana();
        else return null;

    }
}
