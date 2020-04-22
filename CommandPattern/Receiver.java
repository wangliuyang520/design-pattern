public class Receiver {
public Order order;
public void execute(Order order){
    StringBuilder sb = new StringBuilder();
    System.out.println("混合果汁:");
    for(String str:order.fruitmap.keySet()){
        sb.append(str).append(order.fruitmap.get(str)+"个");
    }
    System.out.println(sb);
}
}
