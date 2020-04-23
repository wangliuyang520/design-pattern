public class RaiseStock extends Subject {
    public RaiseStock(String name, double price1) {
        super(name, price1);
    }

    @Override
    public void allnotify() {
        for (IObserver iObserver : list) {
            iObserver.update(this);
        }
    }
}
