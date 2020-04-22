public class ConcreteCommond implements ICommand{
    Receiver receiver;
    Order order;
    public ConcreteCommond(Receiver receiver,Order order){
        this.receiver=receiver;
        this.order=order;
    }
    public void execute(){
        System.out.println(order.id+"号订单");
        receiver.execute(order);
    }
}
