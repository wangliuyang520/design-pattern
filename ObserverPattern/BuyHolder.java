import java.util.HashSet;
import java.util.Set;

public class BuyHolder implements IObserver {
    Set<Subject> set = new HashSet<Subject>();

    @Override
    public void update(Subject subject) {
        if (subject.getPrice1() - subject.getPrice2() > 0)
            System.out.println(subject.name+"涨了"+(subject.getPrice1() - subject.getPrice2() )+"，笑嘻嘻");
        else System.out.println(subject.name+"亏了"+(subject.getPrice2() -subject.getPrice1())+"，笑嘻嘻");
    }

    @Override
    public void addStock(Subject subject) {
        set.add(subject);
        subject.addObserver(this);
    }

    @Override
    public void remove(Subject subject) {
        set.remove(subject);
        subject.removeObserver(this);
    }
}
