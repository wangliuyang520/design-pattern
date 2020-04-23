import java.util.HashSet;
import java.util.Set;

public class SellHolder implements IObserver {
    Set<Subject> set = new HashSet<Subject>();

    @Override
    public void update(Subject subject) {
        if (subject.getPrice1() - subject.getPrice2() > 0)
            System.out.println(subject.name+"涨了"+(subject.getPrice1() -subject.getPrice2())+"我亏了，哭唧唧");
        else  System.out.println(subject.name+"跌了"+(subject.getPrice2() -subject.getPrice1())+"我赚了，笑嘻嘻");
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
