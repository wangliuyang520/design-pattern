import java.util.Hashtable;

public class ProtoctypePattern {
    Hashtable<Integer,Fruit> fruittable = new Hashtable<Integer, Fruit>();
    public void add(int a,Fruit fruit){
        fruittable.put(a,fruit);
    }
    public Fruit getFruit(int key){
            Fruit fruit = (Fruit) (fruittable.get(key).clone());
        return fruit;
    }
}
