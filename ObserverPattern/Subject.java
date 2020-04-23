import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    protected double price1, price2;
    public String name;
    protected List<IObserver> list;

    public double getPrice2() {
        return price2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subject subject = (Subject) o;

        return name.equals(subject.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public abstract void allnotify();

    public double getPrice1() {
        return price1;
    }

    public Subject(String name, double price1) {
        this.name = name;
        this.price1 = price1;
        list = new ArrayList<IObserver>();
    }

    public void addObserver(IObserver iobserver) {
        list.add(iobserver);
    }

    public void removeObserver(IObserver iobserver) {
        if (list.contains(iobserver))
            list.remove(iobserver);
    }

    public void setPrice(double price1) {
        this.price2=this.price1;
        this.price1 = price1;
        allnotify();
    }
}
