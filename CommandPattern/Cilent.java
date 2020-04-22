public class Cilent {
    public static void main(String[] args) {
        WaiterInvoker invoker = new WaiterInvoker();
        Receiver receiver = new Receiver();

        Order order1 = new Order();
        order1.setFruitmap("香蕉",1);
        order1.setFruitmap("苹果",2);
        order1.setFruitmap("葡萄",3);

        Order order2 = new Order();
        order1.setFruitmap("冬枣",1);
        order1.setFruitmap("柠檬",2);
        order1.setFruitmap("芒果",3);

        ICommand command1 = new ConcreteCommond(receiver,order1);
        ICommand command2 = new ConcreteCommond(receiver,order2);

        invoker.add(command1);
        invoker.add(command2);

        invoker.orderUP();
    }

}
