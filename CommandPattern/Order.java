import java.util.HashMap;

public class Order {
    public int id;
    public static int id1=0;
    public HashMap<String ,Integer> fruitmap=null;
    public Order(){
        this.fruitmap=new HashMap<String , Integer>();
        id1++;
        id=id1;
    }
    public void setFruitmap(String fruitname,int namenumer){
        fruitmap.put(fruitname,namenumer);
    }
}
