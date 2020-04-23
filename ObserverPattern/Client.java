public class Client {
    public static void main(String[] args) {
        IObserver buy = new BuyHolder();
        IObserver sell = new SellHolder();

        Subject stock1 = new RaiseStock("石油期货",5);
        Subject stock2 = new RaiseStock("货币基金",6);

        buy.addStock(stock1);
        buy.addStock(stock2);

        sell.addStock(stock1);
        sell.addStock(stock2);

        stock1.setPrice(7);
        stock2.setPrice(3);
    }
}
