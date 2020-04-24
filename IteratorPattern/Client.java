import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        Television sky = new SkyworthTelevison();
        TVIterator iterator = sky.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
