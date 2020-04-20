public class Main {
    public static void main(String[] args) {
        BuyBasket basket = new BuyBasket();
        basket.add(new Apple());
        basket.add(new Book());
        
        basket.accept(new Customer("张三"));
        System.out.println("-----------------------");
        basket.accept(new Saler());
    }
}
