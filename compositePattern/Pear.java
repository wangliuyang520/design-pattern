import java.util.ArrayList;

public class Pear extends MyElement {
    private ArrayList<MyElement> list = new ArrayList <MyElement>();

    public void add(MyElement myElement) {
        list.add(myElement);
    }

    public void remove(MyElement myElement) {
        list.remove(myElement);
    }

    @Override
    void eat() {
        for (MyElement myElement : list) {
            myElement.eat();
        }
    }
}
